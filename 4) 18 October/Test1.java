import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of values you want to enter");

        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers into Array List");

        // Taking the input from the users
        for (int i = 1; i <= n; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("Numbers from users into Array List");
        System.out.println(numbers);

        System.out.println("----------------------------------------------");

        // Ans 1: part a
        // --------------
        // Filter function to filter all the odd numbers

        List<Integer> odd = numbers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());

        System.out.println("Filtered odd numbers");
        System.out.println(odd);

        System.out.println("----------------------------------------------");

        // Ans 1: part b
        // --------------

        // Map function to create a cube of every number

        List<Integer> cube = numbers.stream().map(num -> num * num * num).collect(Collectors.toList());

        System.out.println("Cube of every number");
        System.out.println(cube);

        System.out.println("----------------------------------------------");

    }

}
