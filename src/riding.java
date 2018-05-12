public class riding {

        //Overridden method
        public void ride()
        {
            System.out.println("bike");
        }
    }
    class Boy extends riding{
        //Overriding method
        public void ride(){
            System.out.println("boy riding a bike");
        }
        public static void main( String args[]) {
            Boy obj = new Boy();
            //This will call the child class version of eat()
            obj.ride();
        }

}
