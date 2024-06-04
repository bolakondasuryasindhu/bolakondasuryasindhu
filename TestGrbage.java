 class TestGrbage
{
   public void finalize()  
   {
   System.out.println(" garbage collected object");
  }

 public static void main(String[]args)
{
TestGrbage t=new TestGrbage();
TestGrbage t1=new TestGrbage();

System.out.println(t);
System.out.println(t1);

t=null;
t1=null;

System.out.println(t);
System.out.println(t1);

System.gc();// static method
}
}
