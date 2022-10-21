import java.util.Scanner;

public class lying
{
    public static void main( String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();
        String ly = "ly";
        String ing = "ing";
{
    if (str.length() >= 3) {
        if (str.endsWith("ing")) {
            System.out.println(str.concat(ly));
        } else {
            System.out.println(str.concat(ing));
        }
    }
    else
    {
        System.out.println("Nhap chuoi co 3 ky tu tro len ");
    }
}
    }

}
