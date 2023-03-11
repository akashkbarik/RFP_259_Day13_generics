public class GenericMethod {
    public static <M extends Comparable<M>> M getMax(M a, M b, M c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Integer aInt = 1, bInt = 2, cInt = 3;
        Float aFl = 1.2f, bFl = 8.2f, cFl = 60.2f;
        String aStr = "akash", bStr = "Sonu", cStr = "Muffin";
        System.out.println(getMax(aStr, bStr, cStr));
        System.out.println(getMax(aInt, bInt, cInt));
        System.out.println(getMax(aFl, bFl, cFl));
    }
}
