class Regularinnerclass
{
    class Inner
    {
        void Inner()
        {
            System.out.println("Inner class method");
        }
    }
    void Outer()
    {
        System.out.println("Outer class mmethod");
    }
    public static void main(String[]args)
    {
        Regularinnerclass ob=new Regularinnerclass();
        ob.Outer();
        Regularinnerclass.Inner i=new Regularinnerclass().new Inner();
        i.Inner();
    }
}