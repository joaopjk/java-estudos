package com.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("aluna");
        palavras.add("editora");
        palavras.add("hoje");
        palavras.add("caelum");

        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }

        };
        palavras.forEach(consumidor);

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        palavras.forEach((String s) -> System.out.println(s));

        palavras.forEach(s -> {
            System.out.println(s);
        });

        palavras.forEach(s -> System.out.println(s));

        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });

        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        new Thread(() -> System.out.println("Executando uma ação")).start();


    }

}
