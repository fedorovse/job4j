package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User result = null;
//        for (User user: users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//                result = user;
//                break;
//            }
//        }
//        return result;

        List<User> user = users.keySet().stream()
                .filter(x -> x.getPassport().equals(passport))
                .collect(Collectors.toList());
        if (!user.isEmpty()) {
            result = user.get(0);
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
//        List<Account> accounts = users.get(user);
//        if (user != null && accounts.size() > 0) {
//            for (Account account: accounts) {
//                if (account.getRequisite().equals(requisite)) {
//                    result = account;
//                    break;
//                }
//            }
//        }

        if (user != null) {
            List<Account> accounts = users.get(user)
                    .stream()
                    .filter(x -> x.getRequisite().equals(requisite))
                    .collect(Collectors.toList());
            if (!accounts.isEmpty()) {
                result = accounts.get(0);
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null
                && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
