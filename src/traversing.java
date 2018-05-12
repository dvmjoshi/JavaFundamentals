import java.util.Scanner;

public class traversing {

    public static void main(String[] args) {

        String[] planets = { "Mercury", "Venus", "Mars", "Earth", "Jupiter",
                "Saturn", "Uranus", "Neptune", "Pluto" };
        Scanner scan = new Scanner(System.in);

        for (int i=0; i < planets.length; i++) {

            System.out.println(planets[i]);
        }


    }
}