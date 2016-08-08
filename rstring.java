import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReverseWords {

public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the string");
    String s1 = br.readLine();

    String rev = StringRev(s1);

    System.out.println(rev);

}

private static String StringRev(String s1) 
{

    char[] modString = new char[s1.length()];

    for (int i = 0; i < s1.length(); i++) 
    {
        modString[i] = s1.charAt(s1.length() - 1 - i);
    }

    s = s1.copyValueOf(modString);
    String reverseWord = "";
    String eachWord;
    for (String part : s1.split(" ")) 
    {
        eachWord = new StringBuilder(part).reverse().toString();
        reverseWord = reverseWord + eachWord + " ";
    }

    return reverseWord;

  }

}
