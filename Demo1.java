class Demo1
 {
public static void main(String[] args)
 {
   String s=new String("Anudip");
   s=null;
  System.gc();
 }
 public void finalize()  
   {
   System.out.println(" garbage collected object");
  }

}