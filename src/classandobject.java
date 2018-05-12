public class classandobject {
    int a=10,b=10,ans;
public void  add()
{
 ans=a+b;

}
public  void display()
{
    add();
    System.out.println("addition is:"+ ans);
}
}

  class  in extends classandobject
{
    public  void p(){
        System.out.println("hi");
    }


}
class out extends  in {



    public  void  h(){
        System.out.println("bye,single,multilevel ,final");
    }
}

  class show{
    public  static  void  main (String args[])
    {
        out ob= new out();
    ob.display();
    ob.p();
    ob.h();
    }

}

