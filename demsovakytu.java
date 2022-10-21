import java.util.Scanner;

public class demsovakytu
{
    public static void main(String[] args)
    {
        Scanner st = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = st.nextLine();

        int count =0;
        int var = 0;

        for(int i =0; i < str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                count++;
            }
            if(Character.isDigit(str.charAt(i)))
            {
                var++;
            }
        }
        System.out.println("chu:" + count);
        System.out.println("so:" + var);
    }
}
