import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            
            /*=============KADANE ALGORITHM=====================*/
            
            int gsum = scan.nextInt();    // arr[0]
            int lsum = gsum , x = -1;
            for(int i=1; i<n; i++){
                x = scan.nextInt();
                lsum = Math.max(lsum + x, x);    // lsum = max(lsum + arr[i], arr[i])
                gsum = Math.max(lsum, gsum);
            }
            
            System.out.println(gsum);
        }
    }
    
}
