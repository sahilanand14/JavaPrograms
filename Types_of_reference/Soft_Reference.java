import java.lang.ref.*;
class Soft_Reference
{
public static void main(String[] args) {
	Demo demo=new Demo();
	SoftReference<Demo> softdemo=new SoftReference<>(demo);
	demo=null;
	demo=softdemo.get();
	demo.show();
}

}