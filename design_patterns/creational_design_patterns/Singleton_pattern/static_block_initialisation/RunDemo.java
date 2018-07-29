/*
Static block initialization implementation is similar to eager initialization, except
that instance of class is created in the static block that provides option for exception handling.
*/


class Singleton
{
    private static Singleton object;
    private Singleton() {}
    static
    {
        try
        {
            object = new Singleton();
        }
        catch(Exception e)
        {
            System.out.println("Error.." + e);
        }
    }
    public static Singleton makeObject()
    {
        return object;
    }

}
class RunDemo
{
    public static void main(String[] args)
    {
        Singleton obj = Singleton.makeObject();
        Singleton obj2 = Singleton.makeObject();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj == obj2);
    }
}