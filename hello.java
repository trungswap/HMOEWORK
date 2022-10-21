import java.util.Scanner;
import java.util.ArrayList;
public class hello {
    public static  void main(String[] args )
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner s92 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s92.nextLine();
        for(int i = 0; i <str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                int var = Character.getNumericValue(str.charAt(i));
                arr.add(var);
            }
        }
        System.out.println(arr);
    }
}
