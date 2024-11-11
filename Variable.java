public class Variable {
    public static void main(String[] args) {
        byte aByte = 100;
        short aShort = 10_000;
        int anInt = 1_000_000_000;
        long aLong = 10_000_000_000L;
        float aFloat = 1.5F;
        double aDouble = 1.5;
        boolean aBoolean = true;
        char aChar = 'A';
        String aString = "Hello World";
        final int A_CONSTANT = 1;

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println(aChar);
        System.out.println(aString);
        System.out.println(A_CONSTANT);
    }
}
