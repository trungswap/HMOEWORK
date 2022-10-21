import java.util.ArrayList;

public class replacejava{
    public static String ReplaceJava(int vitri, String str, String replace)
    {
        ArrayList<Integer> viTri = new ArrayList<>();
        for(int i =0 ; i < str.length() - replace.length();i++)
        {
            if (str.startsWith(replace,i))
            {
                viTri.add(i);
                i += replace.length() - 1;
            }
        }
        int count = viTri.toArray().length;
        if (vitri <= 0)
        {
            str = str.substring(0, viTri.get(0)) + "$" +
                    str.substring(viTri.get(0) + replace.length());
        } else if (vitri >= count)
        {
            str = str.substring(0, (viTri.get(count-1))) + "$" +
                    str.substring((viTri.get(count-1)) +
                            replace.length());
        } else
        {
            str = str.substring(0, viTri.get(vitri)) + "$" +
                    str.substring(viTri.get(vitri) +
                            replace.length());
        }
        return str;
    }
    public static void main(String[] args)
    {
        String str = "java hihi java ha java ha java ha java ha java ";
        System.out.println(ReplaceJava(-1,  str,"java"));
    }
}


