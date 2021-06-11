import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>(); 
		System.out.println("Number in array");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int val;
		System.out.println("Enter");
		for(int i =0;i<a;i++)
		{
			val=in.nextInt();
			x.add(val);
			
			
		}
		
		
		boolean flag=false;
		boolean w=false;
		while(w==false)
		{
		   if(flag==false)
		   {
			   
			   val=Collections.max(x);
			   y.add(val);
		        x.remove(new Integer(Collections.max(x)));
		        
		        flag=true;

		   }
		   else
		   {
			  
			   val=Collections.min(x);
			   y.add(val);
		        x.remove(new Integer(Collections.min(x)));
		       
		        flag=false;
		   }
			   
			
		   w=x.isEmpty();
		}
		
		System.out.print(y);
			}

}
