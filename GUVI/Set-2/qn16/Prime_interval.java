import java.io.*;
import java.util.scanner;
public class Prime_interval 
{
public static void main(String[] args) 
{
int low = 20, high = 50;
while (low < high) 
{
boolean flag = false;
for(int i = 2; i <= low/2; ++i) 
{
if(low % i == 0) 
{
flag = true;
break;
}
}
if (!flag)
System.out.print(low + " ");
++low;
}
}
}
When you run the 
