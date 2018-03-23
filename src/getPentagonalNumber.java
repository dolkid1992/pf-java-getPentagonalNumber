import java.util.Scanner;

public class getPentagonalNumber {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        System.out.println("Pentagon is: " +getPentagonalNumber(number));
        }
}
