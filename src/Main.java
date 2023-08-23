import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // Seating capacity of L1
        int y = scanner.nextInt(); // Seating capacity of L2
        int z = scanner.nextInt(); // Seating capacity of L3
        int n = scanner.nextInt(); // Number of students in the class

        // Calculate how many systems will be used in each lab
        int systemsUsedInL1 = Math.min(x, n);
        int systemsUsedInL2 = Math.min(y, n - systemsUsedInL1);
        int systemsUsedInL3 = Math.min(z, n - (systemsUsedInL1 + systemsUsedInL2));

        // Determine which lab is suitable based on maximum system utilization
        if (systemsUsedInL1 >= systemsUsedInL2 && systemsUsedInL1 >= systemsUsedInL3) {
            System.out.println("L1");
        } else if (systemsUsedInL2 >= systemsUsedInL1 && systemsUsedInL2 >= systemsUsedInL3) {
            System.out.println("L2");
        } else {
            System.out.println("L3");
        }
    }
}
