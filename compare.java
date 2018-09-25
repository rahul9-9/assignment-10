import java.util.Scanner;
import java.io.*;
import java.util.*;
class compare
{
public static void main(String[] args)
{
	
	int j,i;
	Scanner s=new Scanner(System.in);
	String q=s.nextLine();
	String w=s.nextLine();
	char[] a=q.toCharArray();
	char[] x=w.toCharArray();
	for(i=0;i<a.length;i++)
	{
j=0;
		 
         if(a[i]==x[j])
		 {
			 System.out.print(a[i]);
		 }
		 ++j;
	
	}
	
}
}