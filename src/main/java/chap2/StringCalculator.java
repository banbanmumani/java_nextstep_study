package chap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        if (text == null || text.equals(" ")) {
            return 0;
        }

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);

        String delimeter = ",|:";
        String[] tokens = text.split(delimeter);

        if (m.find()) {
            delimeter = m.group(1);
            tokens = m.group(2).split(delimeter);
        }

        int result = 0;

        for (String str: tokens) {
            int token = Integer.parseInt(str);
            if (token < 0) {
                throw new RuntimeException("parameter must be positive value");
            }
            result += token;
        }
        return result;
    }
}
