package A;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,4,3,2,1};
		System.out.println("duplicate values are: ");
		for(int i=0; i<a.length-1;i++)
		{
for(int j=i+1; j<a.length;j++)
{
	if(a[i]==a[j])
		{
		System.out.print(a[j]+",");
	}
}
	}

	}
}
