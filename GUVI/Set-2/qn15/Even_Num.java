import java.io.*;
import java.util.scanner;
class Even_Num
{
public static void main(String[] args)
{
try
{
BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number : ");
int num = Integer.parseInt(br1.readLine());
System.out.println("Even Numbers:");
for (int i=1;i <=num ; i++)
{
if(i%2==0 )
{
System.out.print(i+",");
}
}
}
catch(Exception e){}
}
}
