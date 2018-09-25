import java.util.Scanner;
class occurance
{
	public static void main(String[] args)
	{int i,j;
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String d=s.nextLine();
		for(i=0;i<a.length();i++)
		{j=0;
			if(a.charAt(i)==d.charAt(j))
			{
				System.out.print("y");
			}
			j++;
		}
		
	}
}