class String_handling {

    static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char t = (char)(s.charAt(i) + 30);
            sb.append(t);
        }
        return sb.toString();
    }

    static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char t = (char)(s.charAt(i) - 30);
            sb.append(t);
        }
        return sb.toString();
    }
    static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char ch;
            if(Character.isUpperCase(s.charAt(i))) ch = Character.toLowerCase(s.charAt(i));
            else ch = Character.toUpperCase(s.charAt(i));
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String a[]) {
        String s = "puppY";
        String en = encode(s);
        String de = decode(en);
        System.out.println("Encoded text: "+en);
        System.out.println("Decoded text: "+de);
        System.out.println("Reversed text: "+reverse(s));
    }


}