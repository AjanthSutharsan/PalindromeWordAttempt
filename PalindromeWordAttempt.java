
import java.util.Scanner;
public class PalindromeWordAttempt
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word which you wish to check if it is a palindrome or not.");
        String palindromeWord = input.nextLine();
        String palindromeWordU=palindromeWord.toUpperCase();
        
        int length=palindromeWordU.length();
        int a=2;
        int b=length/a;
        int total=0;

        for(int i=0;i<=b-1;i++) {
            if(palindromeWordU.charAt(i)==palindromeWordU.charAt(length-1-i)) {
                total+=1;
            }
        }
        if(total==b) {
            System.out.println("The word you have entered is a palindrome word.");
        }
        else {
            System.out.println("The word you have entered isn't a palindrome word.");
        }

      
    }

}
