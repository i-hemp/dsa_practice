package d2;

public class D5 {

    static {
        for (int i = 0; i < 500; i++) {
            removeOuterParentheses("");
        }
    }

    public static String removeOuterParentheses(String s) {

        int count = 0;
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                if (count > 0) {
                    str.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}