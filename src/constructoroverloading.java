/**
 * Created by Dell on 24-01-2018.
 */
public class constructoroverloading {
    int a,b,c,ans;
    constructoroverloading(int x)
    {
        a=x;
        System.out.println("a is"+a);
    }
    constructoroverloading(int x, int y){

        a=x;
        b=y;
        c=a+b;
        System.out.println("addition is"+ c);
    }
    constructoroverloading(int x,int y,int z){
        a=x;
        b=y;
        c=x;
        ans=a*b*c;
        System.out.println("mul is "+ ans);
    }


}

class  uic{
   public  static  void main (String args[]){
      constructoroverloading b1= new constructoroverloading(10);
      constructoroverloading b2 =new constructoroverloading(10,20);
      constructoroverloading b3=new constructoroverloading(10,20,30);

   }
}
