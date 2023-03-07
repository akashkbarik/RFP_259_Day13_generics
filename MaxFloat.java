public class MaxFloat {
    public Float FindMaxNumber(Float firstnum, Float secondnum, Float thirdnum) {
        if (firstnum.compareTo(secondnum) > 0 && firstnum.compareTo(thirdnum) > 0) {
            return firstnum;
        } else if (secondnum.compareTo(firstnum) > 0 && secondnum.compareTo(thirdnum) > 0) {
            return secondnum;
        } else
            return thirdnum;
    }

    public static void main(String[] args) {
        MaxFloat maxFloat = new MaxFloat();
        System.out.println("maximum number is : "+maxFloat.FindMaxNumber(2.5f,2.0f,3.1f));
    }
}
