import java.util.Scanner;
class Salary
{
public static void main(String aa[])
{
int sal, b;
Scanner obj= new Scanner(System.in);
System.out.println("Enter the salary");
sal=obj.nextInt();
if (sal > 10000)
{b= (sal * 10)/100;
sal= sal + b;}
else
{b=(sal * 5)/100;
sal= sal + b;}
System.out.println("The Salary is" +sal);
}
}
