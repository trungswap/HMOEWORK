import java.util.Scanner;

public class haibonhoa
{
    public static void main(String[] args)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Nhap chuoi:");
            String string = kb.nextLine();
            int uppernum =0;
            for(int i = 0; i < string.substring(1,4).length();i++ )
            {
                if(Character.isUpperCase(string.charAt(i))){
                    uppernum++;
                }
                if(uppernum <=2)
                {
                    System.out.println(string.toUpperCase());
                }
                break;
            }

        }
}