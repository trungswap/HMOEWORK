import java.util.Scanner;

public class oddvalue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 1) {
                str += string.charAt(i);
            }
        }
        System.out.println(str);
    }
}
