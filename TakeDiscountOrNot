import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        while (T-- > 0) {
            int N = sc.nextInt(); 
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            
            int[] A = new int[N];
            int totalWithoutCoupon = 0;
            int totalAfterDiscount = 0;
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                totalWithoutCoupon += A[i]; 
                totalAfterDiscount += Math.max(0, A[i] - Y);
            }
            
            int totalWithCoupon = X + totalAfterDiscount;
            
            if (totalWithCoupon < totalWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
        
        sc.close();
    }
}
