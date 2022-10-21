import java.util.Scanner;
public class doicho
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        String lastChar = String.valueOf(string.charAt(string.length() -1 ));
        int land = string.indexOf(lastChar);
        String firstChar = String.valueOf(string.charAt(0));
        String str = string.substring(1);
        String ne = string.substring(land) + str.replace(lastChar,firstChar);
        System.out.println(ne);
    }
}
