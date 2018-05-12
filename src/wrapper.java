public class wrapper {
    public static  void main (String[]args)
    {
        int a=10;
        Integer i= Integer.valueOf(a);
        Integer j=a;
        System.out.println(""+i+""+a+""+j);
        Integer s=new Integer(9);
        int o=s.intValue();
        int k=s;
        System.out.println(""+o+""+k+""+s);
    }
}
