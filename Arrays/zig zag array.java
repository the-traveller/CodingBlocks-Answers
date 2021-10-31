import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    /*
        HINT - even indexes must be lower than their adjacent next odd (i.e, odd = peak and even = valley)   /\/\/\/\/
        
        approach - 
        step1 - initialize i=1 (and keep comparing with i-1)
        step2 - (odd i must be peak and even i must be valley)
                hence if (i==odd and arr[i-1]>arr[i]) --> swap (i, i-1)  // arr[i] should be peak
           similarily if (i==even and arr[i-1]<arr[i])--> swap (i, i-1)  // arr[i] should be valley
    */
     
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
     
    public static void zigZag(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(i%2!=0 && arr[i-1]>arr[i]){          // odd
                swap(arr, i, i-1);
                continue;
            }
            if(i%2==0 && arr[i-1]<arr[i]){          // even
                swap(arr, i, i-1);
                continue;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append(arr[i]+" ");
        System.out.println(sb);
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
		    zigZag(arr, n);
		}
	}
}
