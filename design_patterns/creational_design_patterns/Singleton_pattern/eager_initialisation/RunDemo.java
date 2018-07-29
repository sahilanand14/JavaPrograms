/*
In eager initialization, the instance of Singleton Class is created at the time of class loading
but it has a drawback that instance is created even though client application might not be using it.
 Also this method doesn’t provide any options for exception handling.
 */
class Singleton
{
    private static Singleton object = new Singleton();
    private Singleton() {}
    public static Singleton makeObject()
    {
        return object;
    }

}
class RunDemo
{
    public static void main(String[] args)
    {
    	Singleton obj=Singleton.makeObject();
    	Singleton obj2=Singleton.makeObject();
    	System.out.println(obj.hashCode());
    	System.out.println(obj2.hashCode());
    	System.out.println(obj==obj2);
    }
}