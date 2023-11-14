public class PalindromeHalfnumpy {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces printing
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // 1st half palindrome
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // 2nd half palindrome
            for (int p = 2; p <= i; p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
