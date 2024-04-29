package StringBuilder;

public class String1 {

	public static void main(String[] args) {
		int l,i;
		String a="Divya Mishra";
		String a1="";
		l=a.length();
		for(i=l-1;i>=0;i--)
		{
			a1=a1+a.charAt(i);
		}
		System.out.println(a1);
		// TODO Auto-generated method stub

	}

}
