/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    Main obj = new Main();
	    obj.prime(arr, n);
	}

public void prime(int arr[], int n){
    for(int i = 0; i < n; i++){
        int num = arr[i];
        int count = 0;

        if(num <= 1) continue; 

        for(int j = 2; j <= num / 2; j++){
            if(num % j == 0){
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("prime " + arr[i]);
        }
    }
}
}


