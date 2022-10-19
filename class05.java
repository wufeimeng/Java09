class CCount{
    private static int cnt=0;
    public CCount()
    {
        count();
    }
    public static void count(){
        cnt++;
    }
    public static void Zreo(){
        cnt=0;
    }
    public static void setint(int n){
        cnt=n;
    }
    public static void show(){
        System.out.println("cnt="+cnt);
    }

}
public class class05 {
    public static void main(String[] args) {
       CCount num1=new CCount();
       CCount num2=new CCount();
       CCount num3=new CCount();
       CCount num4=new CCount();
       CCount.show();  
       CCount.Zreo();
       CCount.show();
       CCount.setint(90);
       CCount.show(); 
    }
    
}
