import java.util.*;
public class Main {
    public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("2");
		
		for(int i=2;i<=n;i++)
		{	
			int j=2,flag=0;
			if(i==3)
			System.out.println("3");
			while(j<i )
			{
				if(i%j==0)
				break;
				else
				{
					if(i/2==j)
					flag=1;
				}
				j++;
			}
			if(flag==1)
			System.out.println(i);
			
		}
		
        // Your Code Here
    }
}
