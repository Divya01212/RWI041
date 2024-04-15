package A;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20,ch;
System.out.println("Enter User choice");
Scanner r=new Scanner(System.in);
ch= r.nextInt();
Switch(ch)
{
	case 1: System.out.println("sum" +(a+b));
	break;
	case 2: System.out.println("sub" -(a-b));
	break;
	case 2: System.out.println("mul" *(a*b));
	break;	
}
	}

}
