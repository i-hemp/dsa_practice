package d2;

public class D7 {
    public static String reverseWords2(String s) {
        // Code here
        s = s.replaceAll("\\.", " ");
        System.out.println(s);
        String ans = "";
        int startIndex = -1;
        int endIndex = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ' || i == 0) {

                // System.out.print(s.charAt(i));
                // } else {
                startIndex = i;
                // System.out.println
                if (!s.substring(startIndex, endIndex + 1).isBlank())
                    ans += (s.substring(startIndex, endIndex + 1)).trim() + " ";
                // (startIndex) + " " + (endIndex + 1) + " " +
                endIndex = i;
            }
        }
        return ans.trim();
    }

    public static String reverseWords(String s) {
        String ans = "";
        int startIndex = -1;
        int endIndex = s.length() - 1;
        s.replaceAll(".", " ");
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ' || i == 0) {

                // System.out.print(s.charAt(i));
                // } else {
                startIndex = i;
                if (!s.substring(startIndex, endIndex + 1).isBlank())
                    ans +=
                            // " " + startIndex + " " +
                            s.substring(startIndex, endIndex + 1).trim() + " ";
                // +endIndex + " ";
                // System.out.println(
                // s.substring(startIndex, endIndex + 1).trim());
                // (startIndex) + " " + (endIndex + 1) + " " +
                endIndex = i;
            }
        }
        return ans.trim();
    }

    public static void main(String[] args) {
        String res = reverseWords("a good   example");
        System.err.println(res);
        String res2 = reverseWords2("a good   example");
        System.err.println(res2);
    }
}
