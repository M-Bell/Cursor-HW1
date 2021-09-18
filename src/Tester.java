public class Tester {

    public static void main(String[] args) {
        byte byteA = 127, byteB = 5;
        short shortA = 32000, shortB = 22;
        int intA = 41232, intB = 1233;
        long longA = 4123125134L, longB = 4132423L;
        float floatA = 10.23F, floatB = 15.212F;
        double doubleA = 10.312, doubleB = 15.1123;
        System.out.println("Byte");
        System.out.println("a + b = " + (byte) (byteA + byteB));
        System.out.println("a - b = " + (byte) (byteA - byteB));
        System.out.println("a * b = " + (byte) (byteA * byteB));
        System.out.println("a / b = " + (byte) (byteA / byteB));

        System.out.println("Short");
        System.out.println("a + b = " + (short) (shortA + shortB));
        System.out.println("a - b = " + (short) (shortA - shortB));
        System.out.println("a * b = " + (short) (shortA * shortB));
        System.out.println("a / b = " + (short) (shortA / shortB));

        System.out.println("Int");
        System.out.println("a + b = " + (intA + intB));
        System.out.println("a - b = " + (intA - intB));
        System.out.println("a * b = " + (intA * intB));
        System.out.println("a / b = " + (intA / intB));

        System.out.println("Long");
        System.out.println("a + b = " + (longA + longB));
        System.out.println("a - b = " + (longA - longB));
        System.out.println("a * b = " + (longA * longB));
        System.out.println("a / b = " + (longA / longB));

        System.out.println("Float");
        System.out.println("a + b = " + (floatA + floatB));
        System.out.println("a - b = " + (floatA - floatB));
        System.out.println("a * b = " + (floatA * floatB));
        System.out.println("a / b = " + (floatA / floatB));

        System.out.println("Double");
        System.out.println("a + b = " + (doubleA + doubleB));
        System.out.println("a - b = " + (doubleA - doubleB));
        System.out.println("a * b = " + (doubleA * doubleB));
        System.out.println("a / b = " + (doubleA / doubleB));
    }
}
