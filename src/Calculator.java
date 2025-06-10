public class Calculator {

    public static int add(int a, int b) {
        return (a + b);
    }

    public static int sub(int a, int b) {
        return (a - b);
    }

    public static int mul(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }

    public static int mod(int a, int b) {
        return (a % b);
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println("Somme: " + add(4, 6));
        System.out.println("Difference: " + sub(12, 6));
        System.out.println("Produit: " + mul(4, 6));
        System.out.println("Quotient: " + div(12, 6));
        System.out.println("Modulo: " + mod(12, 6));
    }
}
