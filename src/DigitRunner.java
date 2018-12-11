public class DigitRunner {
    public static void main(String[] args)
    {
        digits digits1 = new digits(7);
        System.out.println(digits1.isStrictlyIncreasing());

        digits digits2 = new digits(65310);
        System.out.println(digits2.isStrictlyIncreasing());

        System.out.println(new digits(1356).isStrictlyIncreasing());
        System.out.println(new digits(1336).isStrictlyIncreasing());
        System.out.println(new digits(1536).isStrictlyIncreasing());

        System.out.println(digits2.getDigitList());
    }
}
