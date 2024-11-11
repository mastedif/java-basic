public class TypeComparisonOperator {
    public static void main(String[] args) {
        Car car = new Car();
        Car accord = new Sedan();

        System.out.println(car instanceof Car);
        System.out.println(car instanceof Sedan);
        System.out.println(car instanceof Vehicle);
        System.out.println(accord instanceof Car);
        System.out.println(accord instanceof Sedan);
        System.out.println(accord instanceof Vehicle);
    }
}

class Car {}

interface Vehicle {}

class Sedan extends Car implements Vehicle {}
