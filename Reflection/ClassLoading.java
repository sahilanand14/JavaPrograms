class ClassLoading
{
	public static void main(String []args)
	{
		//this statement loads the Thread class and creates its Object in heap.
		// also a Class class object is also created in heap representing info of Thread class.
		Thread t1=new Thread();
		Class c1=t1.getClass();
		//now class will NOT be loaded again so no new Class class object will be created.
		Thread t2=new Thread();
		Class c2=t1.getClass();
		System.out.println(c1==c2);
		System.out.println(c1.hashCode()==c2.hashCode());
// this shows both c1 and c2 point to the same Class class object. Hence there is only 1 Class class  Object created.
     
     
      System.out.println(java.lang.String.class.getClassLoader());//BootStarp ClassLoader is not a java object hence we get 'null'.
  System.out.println(ClassLoading.class.getClassLoader());
  
          
  
	}

}
// NOTE: '==' checks reference id only i.e it returns true if both operands point to same object.