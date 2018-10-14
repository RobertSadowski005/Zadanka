package TextChains;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import java.util.regex.Matcher;

public class StringOccurances {
    public static void main(String[] args) {
        String text = "ASDLQWOEPQW";
        String key = "SD";

        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find)) {

        }

//        int index = text.indexOf(key);
//        System.out.println();
    }


}
