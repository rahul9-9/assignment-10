import java.util.Scanner;
class main1
{
public static void main(String[] args)
{
	int c=0;
	int v;
String r="";
Scanner s=new Scanner(System.in);
String q=s.nextLine();
for(int i=0;i<q.length();i++)
{
if(q.charAt(i)==' ' && q.charAt(i+1)!=' ')
{
c++;
}

}
v=c+1;
System.out.print(v);

}


}