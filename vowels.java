import java.util.Scanner;
import java.io.*;
import java.util.*;
class vowels
{
public static void main(String[] args)
{
	
	int i;
	Scanner s=new Scanner(System.in);
	String z="";
	String q=s.nextLine();
	for(i=0;i<q.length();i++)
	{
		
		if(q.charAt(i)=='a'||q.charAt(i)=='e'||q.charAt(i)=='i'||q.charAt(i)=='o'||q.charAt(i)=='u')
		{
			
		}
		else
		{
			z=z+q.charAt(i);
		
		
	}
	
}
System.out.print(z);}
}