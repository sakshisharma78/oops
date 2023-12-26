public class prob2 {
    int x = 10;

    void modifyValue(int val) {
        x = val * 2;
    }

    int getValue() {
        return x;
    }

    public static void main(String[] args) {
        prob2 obj1 = new prob2();
        prob2 obj2 = obj1;
        prob2 obj3 = new prob2();
        obj2.modifyValue(5);
        obj3.modifyValue(7);
        {

        }
        System.out.println("obj1 value: " + obj1.getValue());
        System.out.println("obj2 value: " + obj2.getValue());
        System.out.println("obj3 value: " + obj3.getValue());
    }
}
