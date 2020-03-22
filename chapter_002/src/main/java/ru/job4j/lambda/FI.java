package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("imge1", 20),
                new Attachment("imge2", 100),
                new Attachment("imge", 35)
        };
        Comparator<Attachment> comparator = (o1, o2) -> o1.getSize() - o2.getSize();
        System.out.println();
        Arrays.sort(attachments, comparator);
        System.out.println();
        for (Attachment attachment: attachments) {
            System.out.println(attachment);
        }

        String[] strings = {"135", "3", "33", "5", "12", "2886"};
        Comparator<String>  cmpStrSize = (left, right) -> left.length() - right.length();
        Arrays.sort(strings, cmpStrSize);
        for (String str: strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        Comparator<String> cmpStrText = (left, right) -> left.compareTo(right);
        Arrays.sort(strings, cmpStrText);
        for (String str: strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
        Arrays.sort(strings, cmpDescSize);
        for (String str: strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
