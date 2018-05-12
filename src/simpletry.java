import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpletry {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        System.out.println(" enter the value of a ");
        int a= Integer.parseInt(br.readLine());
        System.out.println("enter the value of b");
        int b= Integer.parseInt(br.readLine());
        try
        {
            int c=a/b;
            System.out.println("ans is"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("what divide by zero ?");
        }

    }
}
