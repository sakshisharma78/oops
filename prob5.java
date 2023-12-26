public class prob5 {
    int x = 5;

    void modifyValue(int y) {
        x = x + y;
    }

    void printValue() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        prob5 obj = new prob5();

        int a = 10;
        int b = 20;
        obj.modifyValue(a);
        obj.printValue();
        obj.modifyValue(b);
        obj.printValue();
    }
}
