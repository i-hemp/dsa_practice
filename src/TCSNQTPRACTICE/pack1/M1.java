package TCSNQTPRACTICE.pack1;
//remove brackets from string
public class M1 {
    public static void main(String[] args) {
        // Input: “a+((b-c)+d)”
        // Output: “a+b-c+d”
        String s = "a+((b-c)+d)";

        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        // // if (s.charAt(i) == '(') {
        // count++;
        // // }

        // }
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                continue;
            } else {
                ss += s.charAt(i);
            }
        }
        // String g = s.replace("(", "");
        // s.replaceAll("(", "");
        // System.out.println(g);
        System.out.println(ss);
    }
}
