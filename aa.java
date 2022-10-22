public class aa
{
    public static void main(String[] args)
    {
        String s = "abcd abc aabc baa abcaa";
        String str ="aa";
        int num = s.split(str,-1).length -1;
        System.out.println(num);
    }
}
