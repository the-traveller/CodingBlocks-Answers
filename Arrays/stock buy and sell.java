import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void maxProfit(int[] arr, int n){
        int i=1, min=0, max=-1;         // min < i
        while(i<n){
            if(arr[min] >= arr[i]){ min++; i++; } // (downfall) i <= min  --> min++ i++
            else{
                max = i;                          // (increment) i > min   --> max = i
                while(max+1 < n){
                    if(arr[max] <= arr[max+1]){ max++; }  // max+1 >= max --> max++ (increment)
                    else{ break; }                        // max+1 < max  --> break (downfall)
                }
                System.out.print("("+min+" "+max+") ");  // we have both min and max now hence print
                
                min = max+1;   // reset min
                i = min+1;     // reset i such that ( min < i )
            }
        }
        if(max == -1) System.out.println("No Profit");  // for only downfall case
        else System.out.println();
    }
     
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String str[] = br.readLine().trim().split("\\s+");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(str[i]);
		    }
		    maxProfit(arr, n);
		}
	}
}
