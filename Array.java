public class Array {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
        System.out.println(numbers[0]);
        System.out.println(numbers.length);

        numbers[0] = 10;

        System.out.println(numbers[0]);

        String[][] cars = {
            { "Honda", "Toyota" },
            { "Accord", "Camry" }
        };

        System.out.println(cars[0][0] + " " + cars[1][0]);
        System.out.println(cars[0][1] + " " + cars[1][1]);

        String[] colors = { "Red", "Green", "Blue", "Black", "White" };
        String[] rgb = java.util.Arrays.copyOfRange(colors, 0, 3);

        for (String color : rgb) {
            System.out.println(color);
        }
    }
}
