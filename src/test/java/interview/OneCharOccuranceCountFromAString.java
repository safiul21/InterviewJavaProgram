package interview;

import java.util.Scanner;

public class OneCharOccuranceCountFromAString {
    public static void main(String[] args) {
        System.out.println("Enter your sentence");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        String[] words= str.split(" ");
        for (String w: words){

int total_length= w.length();
String w_update = w.replace("a","");
int replace_length= w_update.length();
int count= total_length-replace_length;
            System.out.println(w +   "=>" +count);


        }


    }

}
