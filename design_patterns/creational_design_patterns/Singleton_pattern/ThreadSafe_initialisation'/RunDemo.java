class Singleton
{
    private static  Singleton obj;

    public synchronized static Singleton makeObject()
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

class Singleton2
{
    private static  Singleton2 obj;

    public  static Singleton2 makeObject()
    {
        if(obj == null)
        {
            synchronized (Singleton2.class)
            {
                if(obj == null)
                    obj = new Singleton2();
            }
        }


        return obj;
    }
    //private constructor so that nobody can create object of this class. If we dont write it, compiler will insert default constructor
    //which is not private.
    private Singleton2() {}
}



class RunDemo
{
    public static void main(String[] args)
    {
        Singleton s = Singleton.makeObject();
        Singleton ss = Singleton.makeObject();
        System.out.println(s == ss);
        Singleton2 s1 = Singleton2.makeObject();
        Singleton2 ss1 = Singleton2.makeObject();
        System.out.println(s1 == ss1);
    }
}