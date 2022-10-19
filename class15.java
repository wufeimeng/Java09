package w87;

class CCircle     
{
  
   private double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public static double compare(CCircle c[])  
   {
      double average=0.0;
      for(int i=0;i<c.length;i++)
    	  average+=c[i].radius;
      
      return average/c.length;
   }
}

public class class15
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0);
      cir[2]=new CCircle(2.0);

      System.out.println("average = "+CCircle.compare(cir));
   }
}
