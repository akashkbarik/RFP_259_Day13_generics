public class MaxInteger {
    public int FindMaxNumber(Integer firstnum, Integer secondnum, Integer thirdnum) {
        if (firstnum.compareTo(secondnum) > 0 && firstnum.compareTo(thirdnum) > 0) {
            return firstnum;
        } else if (secondnum.compareTo(firstnum) > 0 && secondnum.compareTo(thirdnum) > 0) {
            return secondnum;
        } else
            return thirdnum;
    }

    public static void main(String[] args) {
        MaxInteger maxInteger = new MaxInteger();
        System.out.println("maximum number is : "+maxInteger.FindMaxNumber(1,2,3));
    }
}