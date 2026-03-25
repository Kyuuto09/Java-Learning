package playground;

public class test {

    public static void swapNumber(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.printf("Swapped: %d, %d\n", x, y);
    }


    // task swap array
    public static void arraySwap() {

    }

    public static void arrayReference() {
        // arr1 and arr2 points to the same memory e.g: 0x1234
        int[] arr1 = {33}; // arr1: here we put 33 into 0x1234
        int[] arr2 = arr1; // arr2 now points to the same memory that arr1 has. 0x1234

        // now accessing the same memory 0x1234 that arr1 has, we change the value on the 0 index in memory address 0x1234
        arr2[0] = 77;

        System.out.printf("Arr1: %d\nArr2: %d\n", arr1[0], arr2[0]);

        System.out.println(arr1); // hex string
    }

    static void main(String[] args) {
        // swap
        int x = 10, y = 20;

        System.out.printf("Current: %d, %d\n", x, y);

        swapNumber(10, 20);

        System.out.println("--------------------");

        // array
        // reference type
        arrayReference();
    }
}


/*
package playground;

public class test {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

 */
