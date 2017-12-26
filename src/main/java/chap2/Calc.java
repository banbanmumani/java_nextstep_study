package chap2;

public class Calc {
    public int run(String param) {
        boolean hasCustomSpliter = param.contains("//");
        String splitter = ",|:";
        if (hasCustomSpliter) {
            splitter = param.substring(2,3);
            param = param.replaceAll("//.\n", "");
        }

        String[] arr = param.split(splitter);
        int result = 0;

        for (String str: arr) {
            if(!" ".equals(str)) {
                int token = Integer.parseInt(str);
                if (token < 0) {
                    throw new RuntimeException("parameter must be positive value");
                }
                result += token;
            }
        }
        return result;
    }
}
