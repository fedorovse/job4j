package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.addUser(new User("3212", "Vania"));
        Optional<User> user = bankService.findByPassport("3232");
        if (user.isPresent()) {
            System.out.println(user.get().getUsername());
        }
    }

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> optionalUser = findByPassport(passport);
        if (optionalUser.isPresent() && !users.get(optionalUser.get()).contains(account)) {
            users.get(optionalUser.get()).add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> user = users.keySet().stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst();
        return user;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> optionalAcc = Optional.empty();
        Optional<User> optionalUser = findByPassport(passport);
        if (optionalUser.isPresent()) {
            optionalAcc = users.get(optionalUser.get())
                    .stream()
                    .filter(x -> x.getRequisite().equals(requisite))
                    .findFirst();
        }
        return optionalAcc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
