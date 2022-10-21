import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class stringList {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        List<String> myList = new ArrayList<>(Arrays.asList(string.replace(" " , ",")));
        System.out.println(myList);
    }
}