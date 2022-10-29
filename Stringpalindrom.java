/* String Palindrom checking by comparing both ends */
import java.util.Scanner;
class StringPalindrom1
{
       public static void main(String args[])
       {
             String str;
             int n,i,j,flag=1;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter any String:");
             str=sc.next();
             n=str.length();
             for(i=0,j=n-1;i<j;i++,j--)
                {
                     if(str.charAt(i)!=str.charAt(j))
                        {
                             flag=0;
                             break;
                         }
                 }
             if(flag==1)
                   System.out.println(str+" is Palindrom");
             else
                   System.out.println(str+" is not Palindrom");
           }
 }
