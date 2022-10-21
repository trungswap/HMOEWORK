import java.util.Scanner;

public class chidinh {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        if(string.startsWith("hive"))
        {
            System.out.print("True");
        }
        else
        {
            System.out.println("Nah");
        }
    }
}
