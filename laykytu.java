import java.util.Scanner;

public class laykytu
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();

        char ch = str.charAt(1);
        char ch2 = str.charAt(2);
        char ch3 = str.charAt(3);
        System.out.print(ch);
        System.out.print(ch2);
        System.out.println(ch3);
        System.out.println("Chuoi cua ban la: " + ch+ch2+ch3 );
    }
}
