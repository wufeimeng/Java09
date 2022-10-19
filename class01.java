class CRectangle{
    int width;
    int heigh;
    public CRectangle(int w,int h){
        width=w;
        heigh=h;
    }
    public CRectangle(){
        width=10;
        heigh=8;
    }
    public void show() 
    {
        System.out.println("width:"+width);
        System.out.println("heigh:"+heigh);

        
    }

}
public class class01 {
    public static void main(String[] args) {
        CRectangle ans1=new CRectangle(5,22);
        ans1.show();

        CRectangle ans=new CRectangle();
        ans.show();
       

    }
}
