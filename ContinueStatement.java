public class ContinueStatement {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
        for (int number : numbers) {
            if (number == 3) {
                continue;
            }

            System.out.println(number);
        }
    }
}
