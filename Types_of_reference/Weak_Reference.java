import java.lang.ref.*;
class Weak_Reference
{
	public static void main(String[] args) {

			Demo demo=new Demo(); //here demo is a strong reference

			WeakReference<Demo> weakdemo=new WeakReference<>(demo);

			demo=null;

			demo=weakdemo.get(); //again getting back reference of same object.
			demo.show();

		
	}
}

class Demo
{
	public void show()
	{
		System.out.println("In demo show");
	}

}