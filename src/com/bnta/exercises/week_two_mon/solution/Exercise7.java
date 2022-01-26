package com.bnta.exercises.week_two_mon.solution;

public class Exercise7 {
    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static void main(String[] args) {
        System.out.println(
                longestWords(new String[]{"Will", "Yang", "Foo", "Suraaj", "Sarina", "Suraaj", "Suraaj"})
        );
    }

    static String longestWords(String[] input) {
        String longest = "";
        int longestWord = 0;
        for (String i : input) {
            if (i.length() > longestWord) {
                longestWord = i.length();
                longest = i + ",";
            } else if (i.length() == longestWord) {
                boolean duplicate = false;
                for (String s : longest.split(",")) {
                    if (s.equals(i)) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    longest += i + ",";
                }
            }
        }
        return longest.substring(0, longest.length() - 1);
    }
}
