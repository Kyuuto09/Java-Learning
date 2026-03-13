package lab3;

public class labThree {

    public static void matrixTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrixTable();
    }
}
