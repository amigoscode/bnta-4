package com.amigoscode.exercises.week_one_fri;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};

        for (int i = 0; i < content.length; i++) {
            System.out.println(i + " index -> " + content[i]);
        }

        System.out.println("reverse");

        String result = "";
        for (int i = content.length - 1; i >= 0; i--) {
//            System.out.println(i + " index -> " + content[i]);
            result += content[i] + " ";
//            System.out.println(result);
        }



//        System.out.println(result.substring(6, result.length() - 1) + "?");
        System.out.println("Aaron".substring(0, 3).toLowerCase());
    }
}
