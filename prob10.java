public class prob10 {
    public class VariableMethodQuestion {
        int num = 10;

        void modifyVariable(int value) {
            num = value;
        }

        void printVariable() {
            System.out.println("Value of num: " + num);
        }

        public static void main(String[] args) {
            VariableMethodQuestion obj1 = new VariableMethodQuestion();
            VariableMethodQuestion obj2 = new VariableMethodQuestion();
            obj1.modifyVariable(20);
            obj1.printVariable();
            obj2.printVariable();
        }
    }
}
