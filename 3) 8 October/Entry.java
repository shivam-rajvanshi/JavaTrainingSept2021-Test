import java.io.FileWriter;
import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        User us1 = new User("Shivam", "shivam@gmail.com", "76787878");
        User us2 = new User("Rahul", "rahul@gmail.com", "4354354");

        System.out.println(us1);
        System.out.println(us2);

        System.out.println("------------Taking Input From User-------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String nm = sc.next();

        System.out.println("Enter Email: ");
        String em = sc.next();

        System.out.println("Enter Phone: ");
        String ph = sc.next();

        User us3 = new User(nm, em, ph);
        String st = us3.toString();
        System.out.println(us3);

        try {
            FileWriter fw = new FileWriter("D:\\JavaTestCode\\3. JavaTest_8 Oct\\Text.txt");
            fw.write(st);
            fw.close();
        } catch (Exception e) {
            System.out.println("Please Contact Developer");
        }

    }
}