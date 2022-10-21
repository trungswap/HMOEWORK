import java.util.Scanner;
public class align {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();
        int count = str.length() + 10;
        String left = String.format("%-" + count + "s", str);
        String center = String.format("%" + (count - 5) + "s", str) + String.format("%" + 5 + "s", "");
        String right = String.format("%" + count + "s", str);
             System.out.println( "Left  |" + left + "|" +
                     "\nCenter|" + center + "|" +
                     "\nRight |" + right + "|");
}
}