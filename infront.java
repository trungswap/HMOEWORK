import java.util.Scanner;

public class infront {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();
        char string[] = str.toCharArray();
        int i = string.length-1;
        for (int j = i; j >= 0; j--)
            if (string[j] != ' ') {
                string[i--] = string[j];
            }
            while (i >= 0) {
                string[i--] = ' ';
            }
        System.out.println(string);
    }

}