public class MaxString {
        public static String FindMaxString(String str1, String str2, String str3) {
            if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
                return str1;
            } else if (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0) {
                return str3;
            } else {
                return str2;
            }
        }

    public static void main(String[] args) {
        System.out.println(FindMaxString("akash", "bikash", "priyanka"));
    }
}


