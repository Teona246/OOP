package Exception;

public class Main {
    public static void main(String[] args) {
        System.out.println(devide(0, 4));
        try {
            System.out.println(devide(16, 0));
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }

    }

    public static double devide(int a, int b) {
        int result = a / b;
        return result;
    }
}
