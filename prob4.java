public class prob4 {
    private int number;

    public prob4(int num) {
        number = num;
    }

    public int calculateSquare() {
        return number * number;
    }

    public int calculateCube() {
        return number * number * number;
    }

    public static void main(String[] args) {
        prob4 obj = new prob4(5);
        int squareResult = obj.calculateSquare();
        int cubeResult = obj.calculateCube();
        System.out.println("Number: " + obj.number);
        System.out.println("Square: " + squareResult);
        System.out.println("Cube: " + cubeResult);
    }
}
