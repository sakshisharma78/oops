public class prob1 {
    int result;

    public void add(int num1, int num2) {
        result = num1 + num2;
    }

    public void subtract(int num1, int num2) {
        result = num1 - num2;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        prob1 prob1 = new prob1();
        int num1 = 10;
        int num2 = 5;
        prob1.add(num1, num2);
        System.out.println("Addition result: " + prob1.getResult());
        prob1.subtract(num1, num2);
        System.out.println("Subtraction result: " + prob1.getResult());
    }
}
