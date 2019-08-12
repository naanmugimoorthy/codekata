import java.io.*;
import java.util.scanner;
public class Hello_Ninteger
{
public static void main(String args[] ) throws Exception 
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
int N = Integer.parseInt(line);
for (int i = 0; i < N; i++) 
{
System.out.println("hello world");
}
}
} 
