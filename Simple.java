package A;
import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age;
     System.out.println("Enter your age");
     Scanner r=new Scanner(System.in);
     age= r.nextInt();
     if(age>=18) {
    	 System.out.println("Eligible for votes");	 
     }
     System.out.println("Thank you");
	}

}
