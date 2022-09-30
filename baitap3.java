import java.util.Scanner;

public class baitap3
{
    public static void congchuoi()
    {
        String a = "Hello";
        String b = "World!!";

        System.out.println(a+b);
    }

    public static void upperCase()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s1.nextLine();
        System.out.println(str.toUpperCase());
    }
    public static void countUpper()
    {
        int count = 0;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s2.nextLine();
        for(int i = 0;i < str.length();i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void Demso()
    {
        int count = 0;
        Scanner s3 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s3.nextLine();
        for(int i = 0;i < str.length();i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void inkytule()
    {
        Scanner s4 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s4.nextLine();
        for(int i = 0;i < str.length();i++)
        {
            if (i % 2 != 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void inkytudacbiet()
    {
        Scanner s5 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s5.nextLine();
        for(int i = 0;i < str.length();i++)
        {
            if (!Character.isLetterOrDigit(str.charAt(i)))
            {
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void xoakhoangtrangdau()
    {
        Scanner s6 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s6.nextLine();
        str.strip();
        System.out.println(str);
    }
    public static void demtongchucaithuong()
    {
        int count = 0;
        Scanner s7 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s7.nextLine();
        for(int i = 0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void catchuoi()
    {
        Scanner s9 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s9.nextLine();
        System.out.println(str.substring(1));
    }
    public static void catchuoi2()
    {
        Scanner s91 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s91.nextLine();
        System.out.println(str.substring(1,9));
    }
    public static void getDigit()
    {
        int count = 0;
        Scanner s92 = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = s92.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                count++;
            }
        }
        int index = 0;
        int a[] = new int[count];
        for (int i = 0; i < count; i++) {
            a[index] = Character.getNumericValue(str.charAt(i));
            index++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args)
    {
        congchuoi();
        upperCase();
        countUpper();
        Demso();
        inkytule();
        inkytudacbiet();
        xoakhoangtrangdau();
        demtongchucaithuong();
        catchuoi();
        catchuoi2();
        getDigit();
    }
}
