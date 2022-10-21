import java.util.Scanner;

public class largest {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string = kb.nextLine();
        String word = "", large="";
        String[] words = new String[100];
        int length = 0;

        for(int i = 0; i < string.length(); i++){
            //Split the string into words
            if(string.charAt(i) != ' '  ){
                word = word + string.charAt(i);
            }
            else{
                //Add word to array words
                words[length] = word;
                //Increment length
                length++;
                //Make word an empty string
                word = "";
            }
        }
        for(int k = 0; k < length; k++){
            //If length of large is less than any word present in the string
            //Store value of word into large
            if(large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Largest word: " + large);
    }
}

