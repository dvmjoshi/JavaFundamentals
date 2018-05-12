import java.util.Scanner;
public class gretatest {
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Enter three integers ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if ( x > y && x > z )
            System.out.println(x+" number is largest.");
        else if ( y > x && y > z )
            System.out.println(y+" number is largest.");
        else
            System.out.println(z+" number is largest.");

    }
}
