public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
