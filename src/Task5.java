import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.util.Locale;

public class Task5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Checking a word is Palindrome or not");
        String Word;
        System.out.print("Enter a Word = ");
        Word=br.readLine();
        Word=Word.toLowerCase();
        int i=0,j=Word.length()-1;
        int check=0;
        while (i<j)
        {
            if (Word.charAt(i) != Word.charAt(j))
            {
                check++;
            }
            i++;
            j--;
        }

        if (check==0)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is NOT Palindrome");
        }

    }
}
