/*Single inheritanc with method overriding */
class A
  {
       protected int i;
       void setdata()
        {
            i=8;
        }
      void show()
     {
         System.out.println("i="+i);
      }
}
class B extends A
{
        int j;
      void setdata()
        {
           i=10;
           j=20;
       }
void display()
  {
      show();
      System.out.println("j="+j);
  }
}
class SingleInheritance
{
    public static void main(String args[])
     {
          A objA=new A();
         B objB=new B();
          System.out.println("From Super Class Object:");
         objA.setdata();
         objA.show();
         System.out.println("From subclass Object:");
         objB.setdata();
         objB.display();
    }
}
