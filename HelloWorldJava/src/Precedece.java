public class Precedece {
    public static void main(String[] args) {
        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double result = (firstNumber + secondNumber) * 100;
        boolean hasRemainder = result % 40 == 0.00 ? true : false;

        System.out.println("Result: " + result);

        if (!hasRemainder)
            System.out.println("Got some remainder.");
    }
}
