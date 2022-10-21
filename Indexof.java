import java.util.Scanner;

public class Indexof {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Current character " + str.charAt(i) + " position at "+ i);
        }
    }
}