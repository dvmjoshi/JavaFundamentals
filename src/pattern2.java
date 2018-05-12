import java.util.Scanner;

/**
 * created by Divyam joshi
 */
public class pattern2 extends  classandobject
{

    public static void main(String[] args) {
        int rows ;
        System.out.println("Enter range of series");
        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                 j++;
            }
            System.out.println();
        }

    }
}
