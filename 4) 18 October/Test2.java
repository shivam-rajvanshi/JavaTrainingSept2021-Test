import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        List<String> Languages = Arrays.asList("English", "German", "French");
        List<String> Coding = Arrays.asList("Java", "Python", "C++");
        List<String> Database = Arrays.asList("Mysql", "SqlServer", "MongoDB");

        System.out.println(Languages);
        System.out.println(Coding);
        System.out.println(Database);

        List<List<String>> Coursecategory = new ArrayList<>();

        Coursecategory.add(Languages);
        Coursecategory.add(Coding);
        Coursecategory.add(Database);

        System.out.println(Coursecategory);

        List<String> pro = Coursecategory.stream().flatMap(clist -> clist.stream()).collect(Collectors.toList());
        System.out.println(pro);
    }
}
