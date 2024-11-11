public class BreakStatement {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
        for (int number : numbers) {
            System.out.println(number);

            if (number == 3) {
                break;
            }
        }
    }
}
