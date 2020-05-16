import java.io.*;
import java.util.*;

class comparing
{
    public boolean isPalindrome(String s)
    {
        return (s.length() >= 2) ? (s.charAt(0) != s.charAt(s.length()-1) ? false : isPalindrome(s.substring(1, s.length()-1))) : true;
    }
}

public class reverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        comparing rev = new comparing();
        String input = in.nextLine();

        System.out.println(rev.isPalindrome(input) ? "Yes" : "No");
    }
}