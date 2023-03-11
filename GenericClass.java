public class GenericClass<M extends Comparable<M>> {
    M a, b, c;

    public  M getMax(M a, M b, M c) {
        M max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printMax(a, b, c, max);
        return max;
    }

    public static String getMaxStr(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printMax(a, b, c, max);
        return max;
    }

    public static <M> void printMax(M a, M b, M c, M max) {
        System.out.printf("Max of %s, %s and %s is %s\n", a, b, c, max);
    }

    public static void main(String[] args) {
        Integer aInt = 1, bInt = 2, cInt = 3;
        Float aFl = 1.2f, bFl = 8.2f, cFl = 60.2f;
        String aStr = "Priyanka", bStr = "Priyan", cStr = "Priya";

        GenericClass<String> genericClass = new GenericClass<>();
        GenericClass<Integer> genericClass1 = new GenericClass<>();
        GenericClass<Float> genericClass2 = new GenericClass<>();

        System.out.println(genericClass.getMaxStr(aStr, bStr, cStr));
        System.out.println(genericClass1.getMax(aInt, bInt, cInt));
        System.out.println(genericClass2.getMax(aFl, bFl, cFl));
    }
}

