public class FactorGrid {
    public static void main(String args[]) {
        printFactors(3);
        printFactors(5);

    }

    public static void printFactors(int factor) {
        int number = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                number++;
                if (number % factor == 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print("x ");
                }

            }
            System.out.println();
        }
    }

}
