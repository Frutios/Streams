package com.formation.exo;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*

                ** EXERCISE 1 **
        Random random = new Random();
        IntStream randomInt = random.ints(6,0, 20);

        randomInt
        .sorted()
        .forEach(System.out::println);

        randomInt
        .sorted()
        .limit(1)
        .forEach(System.out::println);


        int sum = randomInt
        .filter(num -> num > 3)
        .sum();t

        System.out.println(sum);

            *** EXERCISE 2 ***
        int[] tab = {-9, 3, -8, 7, -6, 2, -1};
        System.out.println("Les nombres positifs : ");
        1)
        afficherPositif(tab, a -> a > 0);
        System.out.println("Avec predicate : ");
        2 & 3)
        afficherPositifWithPredicate(tab, a -> a > 0);
        afficherPositifWithPredicate(tab, a -> a < 0);
        afficherPositifWithPredicate(tab, a -> a % 2 == 0);


        */


        List<Personne> persons = List.of(
                new Personne ("Laure", "BARBE", 1994, "f"),
                new Personne ("Rihab", "BETTAIEB", 1991,  "F"),
                new Personne ("Aurelien", "DEMOLY", 1993, "h"),
                new Personne ("Tanguy" , "NGUYEN", 1992, "h"),
                new Personne ("Laura", "TENET", 1995, "F"),
                new Personne ("Matthieu", "BILLAUD", 1992, "H"),
                new Personne ("Martin", "TOGNETTI", 1988, "h"),
                new Personne ("Simon", "MAILLARD", 1975, "H"),
                new Personne ("Baptiste", "BLANCHET", 1985, "A")
        );

        // 1)
        /*persons.stream()
                .filter(p -> p.getBirthYear() > 1991)
                .forEach(System.out::println);
        */

        // 2)
        /*persons.stream()
                .filter(p -> p.getBirthYear() == 1995)
                .map(Personne::getLastname)
                .forEach(System.out::println);
        */

        // 3)
            persons.stream()
                .filter(p -> p.getBirthYear() < 1990)
                .sorted(Comparator.comparing(Personne::getLastname))
                .map(Personne::getLastname)
                .forEach(System.out::println);




    }

    public static void afficherPositif(int[] tab, MonFilter monFilter){
        for (int i = 0; i < tab.length ; i++) {
            boolean superiorToZero = monFilter.filterPositive(tab[i]);
            if (superiorToZero){
                System.out.println(tab[i]);
            }
        }
    }

    public static void afficherPositifWithPredicate(int[] tab, Predicate<Integer> predicate){
        for (int i = 0; i < tab.length ; i++) {
            boolean superiorToZero = predicate.test(tab[i]);
            if (superiorToZero){
                System.out.println(tab[i]);
            }
        }

    }

}
