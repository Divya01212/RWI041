package A;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=0;
    System.out.println("Enter any number");
    Scanner r=new Scanner(System.in);
    n= r.nextInt();
    if(n>=0)
    {
    	 System.out.println("possitive number");	
    }
    else
    {
    	 System.out.println("Negative number");		
    }
	}

}
