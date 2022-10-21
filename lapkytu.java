
import java.util.Scanner;

public class lapkytu {
    public static void replaceFirtTo$() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        char firstChar = str.charAt(0);
        String newString = str.replace(firstChar, '$');
        String subString = firstChar + newString.substring(1);
        System.out.println("xau moi: " + subString);
    }
    public static void main(String[] args)
    {
        replaceFirtTo$();
    }

}
