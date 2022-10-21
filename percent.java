import java.util.Scanner;

public class percent {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so:");
        float downloaded = kb.nextFloat();
        float total = 100;
        float percent = (100 * downloaded) / total;

        System.out.println(String.format("%.0f%%",percent));
    }
}