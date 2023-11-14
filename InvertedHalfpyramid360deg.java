public class InvertedHalfpyramid360deg {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop-1
            for (int j = 1; j < i; j++) 
                System.out.print("  ");
            

            // inner loop-2
            for (int k = i; k <=n+1-i; k++) 
                System.out.print("*");
            
            System.out.println();
        }
    }
}
