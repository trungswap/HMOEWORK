import java.util.Scanner;

public class daonguoc {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        StringBuilder str = new StringBuilder(string);

        if(str.length() % 4 == 0)
        {
           System.out.println(str.reverse());
        }
        else{
            System.out.println("Nhap lai");
        }
    }
}
