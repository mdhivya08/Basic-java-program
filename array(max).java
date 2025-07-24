/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Main obj=new Main();
		obj.max(arr,n);
	}
	public void max(int arr[],int n){
	    int temp=arr[0];
	    for(int i=1;i<n;i++){
	        if(temp<arr[i]){
	            temp=arr[i];
	        }
	    }
     System.out.println(temp);
	    
	}
}