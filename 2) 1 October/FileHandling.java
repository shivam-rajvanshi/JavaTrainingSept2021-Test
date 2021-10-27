import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        File Input = new File("D:\\JavaTestCode\\2. JavaTest_1 Oct\\Input.txt");

        try {
            FileWriter Output = new FileWriter("D:\\JavaTestCode\\2. JavaTest_1 Oct\\Input.txt");
            Scanner sc = new Scanner(Input);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int NewVal = Integer.parseInt(val);
                if (NewVal % 2 == 0) {
                    System.out.println(NewVal);
                    String result = String.valueOf(NewVal);
                    Output.write(result + '\n');
                }
            }
            sc.close();
            Output.close();
        } catch (Exception e) {
            System.out.println("Please Contact Developer");
            e.printStackTrace();
        }

    }

}
