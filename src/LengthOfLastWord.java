public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }

    private static int lengthOfLastWord2(String s) {
        int length = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)!=' '){
                length++;
            } else {
                if (length>0){
                    return length;
                }
            }
        }
        return length;
    }
}
