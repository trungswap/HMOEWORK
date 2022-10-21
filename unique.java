import java.util.Arrays;
import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi can nhap?");
        String str = sc.nextLine();
        int count=0;
        String[] arrayStr = str.split(", ");
        Arrays.sort(arrayStr);
        arrayStr[count] = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if (!arrayStr[count].equals(arrayStr[i])) {
                count++;
                arrayStr[count] = arrayStr[i];
            }
        }
        String[] newArray = Arrays.copyOf(arrayStr, count + 1);

        System.out.println(arrayStr);
    }
}