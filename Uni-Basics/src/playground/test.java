package playground;

public class test {
    static void main(String[] args) {
        int x = 10, y = 20;

        System.out.printf("Current: %d, %d\n", x, y);

        swap(10, 20);
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Swaped: %d, %d\n", a, b);
    }
}
