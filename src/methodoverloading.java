public class methodoverloading {

    int a ,b,c;

    double ans;
    public  void add (int a,int b){
        c=a+b;
    System.out.println(""+c);
    }
    public  void add (double a, double b){

        ans=a+b;
        System.out.println(""+ans);
    }


}
class  dis {
    public  static void main (String args []){
        methodoverloading b1=new methodoverloading();
        b1.add(10,20);
        b1.add(1.3,2.5);
    }
        }