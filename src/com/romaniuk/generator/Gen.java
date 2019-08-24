package com.romaniuk.generator;

import java.util.Random;

public class Gen {

    public static String pierwsze() {
        Random rand = new Random();
        int wynik, x = 1800, y = 2099;
        wynik = rand.nextInt(y - x + 1) + x;
        String rok = Integer.toString(wynik);

        return (rok);

    }

    public static String drugie() {
        Random rand = new Random();
        int a, b;
        a = rand.nextInt(2);
        do {
            if (a == 0) {
                b = rand.nextInt(10);
            } else {
                b = rand.nextInt(3);
            }
        }
        while (a + b == 0);

        String dzien1 = Integer.toString(a);
        String dzien2 = Integer.toString(b);
        String miesiac = dzien1 + dzien2;
        return (miesiac);
    }

    public static String trzecie() {
        Random rand = new Random();
        int a, b;
        a = rand.nextInt(4);
        do {
            if (a == 0 || a == 1 || a == 2) {
                b = rand.nextInt(10);
            } else {
                b = rand.nextInt(2);
            }

        }
        while (a + b == 0);

        String liczba1 = Integer.toString(a);
        String liczba2 = Integer.toString(b);
        String dzien = liczba1 + liczba2;
        return (dzien);

    }

    public static String czwarte() {
        Random rand = new Random();
        int a = rand.nextInt(10000);
        String liczba = Integer.toString(a);
        int b = liczba.length();
        if (b == 1) {
            liczba = "000" + liczba;
        } else if (b == 2) {
            liczba = "00" + liczba;
        } else if (b == 3) {
            liczba = "0" + liczba;
        }
        return (liczba);

    }

    public static String kontrolna(String str) {
        int edycja;
        int wynik = 0;
        int[] tab = new int[10];
        int[] tab1 = new int[10];
        for (int i = 0; i <= 9; i++) {
            edycja = Character.getNumericValue(str.charAt(i));
            tab[i] = edycja;
        }
        tab1[0] = 1;
        tab1[1] = 3;
        tab1[2] = 7;
        tab1[3] = 9;
        tab1[4] = 1;
        tab1[5] = 3;
        tab1[6] = 7;
        tab1[7] = 9;
        tab1[8] = 1;
        tab1[9] = 3;

        for (int x = 0; x < 10; x++) {
            wynik += tab[x] * tab1[x];
        }

        wynik = wynik % 10;

        wynik = 10 - wynik;

        wynik = wynik % 10;
        str = Integer.toString(wynik);
        return (str);
    }
}

