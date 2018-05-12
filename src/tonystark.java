
 class  theons {
    public  void earth(){
        System.out.println("i am coming");
    }
}
public class tonystark extends theons implements thor {
    public void fly() {
        System.out.println("hi");

    }


    public void avenger() {
        System.out.println("ironman");
    }

    @Override
    public void asgard() {
        System.out.println("hena destroy");
    }

    @Override
    public void god() {
System.out.println("lord of thunder");
    }
}
class infinitywar{
    public  static  void  main (String args[])
    {
        tonystark t1=new tonystark();
        t1.avenger();
        t1.fly();
        t1.asgard();
        t1.god();
        t1.earth();
    }

}
