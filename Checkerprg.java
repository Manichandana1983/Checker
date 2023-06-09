package Checker;
import java.util.Scanner;
public class Checkerprg {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=obj.nextInt();
	if(num>0) {
		System.out.println("The given number is positive" +num);
		}
	else if(num<0) {
		System.out.println("The given number is negative" +num);
		}
	else {
		System.out.println("The number is zero" +num);
		
	}
	

	}

}
