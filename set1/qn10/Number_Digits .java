import java.util.scanner;
public class Number_Digits 
{
public static void main(String[] args) {
int count = 0, num = 3452;
while(num != 0)
{
num /= 10;
++count;
}
System.out.println("Number of digits: " + count);
}
}
