import java.util.HashMap;
import java.util.Scanner;

public class Test_Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full Name");
        String name = sc.next();

        System.out.println("Enter Phone Number");
        int phone = sc.nextInt();

        System.out.println("Enter Height");
        int height = sc.nextInt();

        System.out.println("Enter Gender");
        String gender = sc.next();

        System.out.println("Enter Marital Status");
        String ms = sc.next();

        HashMap<String, Object> person = new HashMap<>();
        person.put("Full_Name", name);
        person.put("Phone_Number", phone);
        person.put("Height", height);
        person.put("Gender", gender);
        person.put("Marital_Status", ms);

        System.out.println(person);
    }

}
