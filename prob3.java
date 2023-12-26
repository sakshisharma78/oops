public class main {

    private int x;

    public main() {
        x = 5;
    }

    public void setX(int value) {
        x = value;
    }

    public int getX() {
        return x;
    }

    public void incrementX() {
        x++;
    }

    public void printX() {
        System.out.println("The value of x is: " + x);
    }
}

public class prob3 {
    public static void main(String[] args) {
        prob3 obj1 = new prob3();
        prob3 obj2 = new prob3();
        obj1.setX(10);
        obj2.incrementX();
        obj1.printX();
        obj2.printX();
    }
}
