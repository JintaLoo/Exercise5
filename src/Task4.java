import java.io.*;

public class Task4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstString,secondString;
        System.out.println("Checking Alternating or not");
        System.out.print("Enter First String = ");
        firstString= br.readLine();
        System.out.print("Enter Second String = ");
        secondString= br.readLine();

        String C1,C2;
        C1=firstString+secondString;
        C2=secondString+firstString;
        System.out.println(C1);
        System.out.println(C2);

        if(C1.equals(C2))
        {
            System.out.println("It is alternating");
        }else
        {
            System.out.println("It is not alternating");
        }
    }
}
