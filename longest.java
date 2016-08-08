import java.util.*;
public class longest_prefix
{
public static void main(String ar[])throws Exception
{
Scanner s=new Scanner(System.in);
int n,j;
n=s.nextInt();
String a1[]=new String[100];
for(int i=0;i<n;i++)
{
a1[i]=s.next();
}
String long,check;
if(a1.length>0)
long=a1[0];
for(int i=1;i<a1.length;i++)
{
check=a1[i];
for(j=0;j<Math.min(long.length(),a1[i].length());j++)
{
if(long.charAt(j)!=check.charAt(j))
break;
}
long=a1[i].subString(0,j);
}
System.out.println("longest prefix is:"+long);
}
}
