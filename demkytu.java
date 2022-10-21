import java.util.Scanner;

public class demkytu {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = kb.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            ch[i] = str.charAt(i);
            int num = 0;
            for (int j = 0; j <= i; j++)
            {
                if (ch[i] == ch[j])
                    num++;
            }
            if (num == 1)
                System.out.println(
                        "{"
                                + str.charAt(i) + "}"
                                + ":" + count[str.charAt(i)]);
        }
    }
}

