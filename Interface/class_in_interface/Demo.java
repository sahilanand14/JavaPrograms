class Demo extends My1.Inner
{
    public static void main(String[] args)
    {
    		new Demo().display();
    		
    }
}

class ClassInInterface implements My1
{
	public static void main(String[] args) {
		My1 c1=new ClassInInterface();
		c1.show();
		m.show();
		Inner i=new Inner();
		i.display();
	}
}



interface My1
{

    My m = new My()
    {
        public void show()
        {
            System.out.println("annonymous class show");
        }

    };

    class Inner
    {
        public void display()
        {
            System.out.println("Inner class display");
        }
    }


    default void show()
    {
        class MethodLocal
        {
            public void putData()
            {
                System.out.println("Method local class");
            }
        }
        MethodLocal m = new MethodLocal();
        m.putData();
    }


}

interface My
{
    void show();
}