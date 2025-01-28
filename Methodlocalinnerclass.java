class Methodlocalinnerclass
{
    void Outermethod()
    {
        class Inner{
            void Innermethod()
            {
                System.out.println("Inner method class");
            }
        }
        Inner i=new Inner();
        i.Innermethod();
    }
    public static void main(String[]args)
    {
        Methodlocalinnerclass ob=new Methodlocalinnerclass();
        ob.Outermethod();
    }
}