public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // 40.2
        int spacenum = size-1;
        for (int i = 1; i <= size; i++) {
            printWhitespaces(spacenum);
            printStars(i);
            spacenum--;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int spacenum = height-1;
        for (int i = 1; i <= height + 2; i++) {
            if (i <= height) {
                printWhitespaces(spacenum);
                printStars(i + i - 1);
                spacenum--;
            } else {
                printWhitespaces(height - 2);
                printStars(3);
            }
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
