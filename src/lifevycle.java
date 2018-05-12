

public class lifevycle  extends  Thread{

    public  void run(){
        for (int i=0;i<=5;i++){
         if (i==3){
             yield();
         }
         System.out.println("the yield method called");
        }
        System.out.println("exit from a");
    }
}
 class  Bi  extends  Thread{
    public  void run(){
        for (int j=0;j<=5;j++){
            if (j==3){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("exit form b");
    }
}
class C  extends  Thread{
    public void  run()
    {
        for (int P=1;P<=10;P++)
        {
            if ( P==4) {
            try {

                sleep(20);

            } catch (Exception E) {
                E.printStackTrace();
            }
        }
        }
        System.out.println("exit form c");
    }

}

class life {
    public  static  void  main (String[] args){
        lifevycle o1=new lifevycle();
        Bi o2=new Bi();
        C o3=new C();
        o1.start();
        o2.start();
        o3.start();

    }
}