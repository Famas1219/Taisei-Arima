import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {


        String sentence = s;
        int count = 0;
        System.out.println("Enter a sentence :");


        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;
            }
        }
        System.out.println("Number of vowels in the given sentence is " + count);


        return count;
    }

    //Code you problem number two here
    static int problemTwo(String s) {


        int count = 0;
        char[] gan = new char[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            gan[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length() + 1; i++) {
            if (gan[i] == 'b' && gan[i + 1] == 'o' && gan[i + 2] == 'b') {
                count++;
            }
        }
return count;
    }
/*String in = s;
int i =0;
        Pattern p = Pattern.compile("bob");
        Matcher m = p.matcher( in );
        while(m.find()){
            i ++;
        }
        Pattern d = Pattern.compile("bobob");
        Matcher n = d.matcher( in );
       while (n.find()){
            i ++;
        }
        */


    //Code your solution to problem number 3 here
    static String problemThree(String d) {

        String s = d;
        String currentString = "";
        String longString = "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (i == s.length() - 2) {
                if (s.charAt(i) <= s.charAt(i + 1)) {
                    currentString += s.charAt(i);
                    currentString += s.charAt(i + 1);
                    if (currentString.length() > longString.length()) {
                        longString = currentString;
                    }
                }
            }
            if (s.charAt(i) <= s.charAt(i + 1)) {
                currentString += s.charAt(i);
            } else {
                currentString += s.charAt(i);
                if (currentString.length() > longString.length()) {
                    longString = currentString;
                }
                currentString = "";
            }
            //taisei = Character.toString(s.charAt(i));
        }
        System.out.println(longString);

        return longString;
    }

    // Driver code
    public static void main(String[] args) {

/*String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
for (int i = 0; i < arr.length; i ++){
    System.out.println(i + "" + arr[i]);
*/
        System.out.println(problemThree("tunivklq"));

    }

}






