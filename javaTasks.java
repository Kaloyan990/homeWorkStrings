
import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;

public class javaTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        String s = scanner.nextLine();


        if (isReflectionEqual(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    static String Reverse(String s) {
        char[] charArray = s.toCharArray();
        reverse(charArray, 0, charArray.length - 1);
        return new String(charArray);
    }

    static boolean isReflectionEqual(String s) {
        java.util.HashSet<Character> symmetric;
        symmetric = new HashSet<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (symmetric.contains(s.charAt(i)) == false) {
                return false;
            }
        }

        String rev = s;
        s = Reverse(s);


        if (rev.equals(s)) {
            return true;
        } else {
            return false;
        }
    }


    static void reverse(char str[], int start, int end) {


        char temp;
        while (start <= end) {

            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        returnSumOfDigits(); // TASK 2
    }

    private static void returnSumOfDigits() {
        String givenString = "Aa11b33";
        int sumOfDigits = 0;
        for (int eachCharacter = 0; eachCharacter < givenString.length(); eachCharacter++) {
            if (Character.isDigit(givenString.charAt(eachCharacter))) {
                int digit;

                for (digit = eachCharacter + 1; digit < givenString.length(); digit++) {
                    if (!Character.isDigit(givenString.charAt(digit))) {
                        break;
                    }
                }
                sumOfDigits += Integer.parseInt(givenString.substring(eachCharacter, digit));
                eachCharacter = digit;
            }
        }
        System.out.println(sumOfDigits);

        finishYAndZ(); // TASK 3
    }

    private static void finishYAndZ() {
        System.out.println(countYZ("day fyyyz Dad fez fez day"));


    }

    private static int countYZ(String givenString) {
        int count = 0;
        givenString = givenString.toLowerCase();
        for (int allCharacters = 0; allCharacters < givenString.length() - 1; allCharacters++) {
            if ((givenString.charAt(allCharacters) == 'z' || givenString.charAt(allCharacters) == 'y')
                    && !Character.isLetter((givenString.charAt(allCharacters + 1)))) {
                count++;
            }
        }
        if (givenString.charAt(givenString.length() - 1) == 'z' || givenString.charAt(givenString.length() - 1) == 'y') {
            count++;
        }
        return count;

        
    }

    private static void isAPalindrome() {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }

    }
}