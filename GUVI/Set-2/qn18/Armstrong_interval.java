import java.io.*;
import java.util.scanner;
public class Armstrong_interval 
{
public static void main(String[] args) 
{
int low = 999, high = 99999;
for(int number = low + 1; number < high; ++number) 
{
int digits = 0;
int result = 0;
int originalNumber = number;
while (originalNumber != 0) 
{
originalNumber /= 10;
++digits;
}
originalNumber = number;
while (originalNumber != 0) 
{
int remainder = originalNumber % 10;
result += Math.pow(remainder, digits);
originalNumber /= 10;
}
if (result == number)
System.out.print(number + " ");
}
}
}
