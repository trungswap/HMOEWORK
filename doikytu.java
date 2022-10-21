import java.util.Scanner;

public class doikytu {
    public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);
    System.out.println("Nhap xau 1: ");
    String str1 = s1.nextLine();
    Scanner s2 = new Scanner(System.in);
    System.out.println("Nhap xau 2: ");
    String str2 = s2.nextLine();

    String str1n =  str2.substring(0, 2) + str1.substring(2) + " " + str1.substring(0, 2) + str2.substring(2);

    System.out.println(str1n);


}
}
