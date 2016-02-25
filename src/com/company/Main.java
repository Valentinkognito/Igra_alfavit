package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int abc = (int) (Math.random() * arr.length);
        System.out.println(arr[abc]);
        System.out.println("Myindex" + " " + abc);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your bykvy");
        String enter = in.nextLine();
        int Yourindex = Arrays.asList(arr).indexOf(enter);
        System.out.println("Index vvedennoy bykvi" + " " + Yourindex);

        if(enter.equals(arr[abc])){
            System.out.println("You win, krasavchik");
        }
        else if(Yourindex == -1){
            System.out.println("no letter");
        }
        else if(Yourindex > abc){
            System.out.println("Try one more the better, letter up ailphabetical order");
        }
        else if(Yourindex < abc){
            System.out.println("Try one more the better, letter belong ailphabetical order");
        }
    }
}
