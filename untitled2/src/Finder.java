public class Finder {
    public static void main(String args[])
    {

        System.out.println(change("FFFBBR"));
    }
    private static String change(String str) {
        String newStr = "";
        char[] strc = str.toCharArray();
        char prev = strc[0];
        int p = 1;
        for (int i = 1; i < strc.length; i++) {
            if (prev == strc[i]) {
                p++;
            } else {
                newStr = newStr + p + prev;
                p = 1;
            }
            prev = strc[i];
        }
        newStr = newStr + p + prev;
        return newStr;
    }
}