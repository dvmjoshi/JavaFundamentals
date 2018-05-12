public class multithread extends Thread {
    public  void  run() {
        for (int i = 1; i <= 4  ; i++) {
            System.out.println("A is running" + i);
        }
        System.out.println(" A stop running");
    }
}
  class  p extends Thread

{
    public  void  run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("B is running" + i);
        }
        System.out.println(" B stop running ");
    }
}
class  ans {
    public  static  void main (String[] args )

    {
        multithread ob=new multithread();
ob.setPriority(5);
        p ob1=new p();
        ob1.setPriority(ob.getPriority()+2);
        ob.start();
        ob1.start();
    }

}