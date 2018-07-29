class Singleton
{
    private static  Singleton obj;

    public static Singleton makeObject()
    {
        if(obj == null)
            obj = new Singleton();
        return obj;
    }
    //private constructor so that nobody can create object of this class. If we dont write it, compiler will insert default constructor
    //which is not private.
    private Singleton()
    {

    }
}

class RunDemo
{
    public static void main(String[] args)
    {
        Singleton s = Singleton.makeObject();
        Singleton ss = Singleton.makeObject();
        System.out.println(s == ss);
    }
}