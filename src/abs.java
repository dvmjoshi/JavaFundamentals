 abstract class abs {
public   abstract   void  bca();

}
class cu  extends  abs{


    @Override
    public void bca() {
        System.out.println("hello abstract");
    }
}
class  mi {
    public  static void  main (String args[])

    {
        cu ob = new cu();
        ob.bca();
    }
    }