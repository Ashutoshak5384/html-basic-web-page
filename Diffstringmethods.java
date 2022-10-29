/* Program to verify different string methods */
class StringTest
{
      public static void main(String args[])
       {
             String s1="Siliguri";
             String s2="College";
             String s3,s6;
             String s4="New     ";
             String s5="Delhi";
             char ch;
             int n;
             n=s1.length();
             System.out.println("The length of string 1 is "+n);
             s3=s1.toLowerCase();
            System.out.println("The lower case string of string1 is "+s3);
            s3=s1.toUpperCase();
            System.out.println("The lower case string of string1 is "+s3);
            s3=s1.concat(s2);
            System.out.println("The Concatenated string of string1  and string 2 is "+s3);
            ch=s2.charAt(0);
             System.out.println("The first character of string is "+ch);
             s3=s1.substring(4,7);
             System.out.println("The substring of s1 is "+s3);
              s3=s4.concat(s5);
              System.out.println("The Concatenated string of string4  and string 5 is "+s3);
              s6=s4.trim();
              s3=s6.concat(s5);
              System.out.println("The Concatenated string of string6  and string 5 is "+s3);
              System.out.println("The index of g in s1 is "+s1.indexOf('g'));
              System.out.println("S1 and S1 are equal. "+s1.equals(s1));
              System.out.println("S1 and S2 are equal. "+s1.equals(s2));
              System.out.println("S1 greater than S2. "+s1.compareTo(s2));
              System.out.println("S2 greater than S1. "+s2.compareTo(s1));
              System.out.println("S1  and s1 are equal. "+s1.compareTo(s1));
        }
}
