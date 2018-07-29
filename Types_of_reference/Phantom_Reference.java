import java.lang.ref.*;
class Phantom_Reference
{
	public static void main(String[] args) {
		Demo demo =new Demo();
		ReferenceQueue<Demo> refqueue=new ReferenceQueue<>();
		PhantomReference<Demo> phantomdemo=new PhantomReference<>(demo,refqueue);
		demo=null;
		System.out.println(phantomdemo.get());   //phantom reference always returns null.

	}
}
