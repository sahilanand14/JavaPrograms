import java.lang.reflect.*;
class AccessingPrivateField
{
	public static void main(String[] args) throws Exception {
		Dada d=new Dada();
		Class clazz=d.getClass();
		Field[] field=clazz.getFields();
		Field ff=clazz.getDeclaredField("x");
		//System.out.println(Modifier.toString(ff.getModifiers())+"  "+ff.getType().getName()+"  "+ff.get(d));
		// Exception
		// ff.set(d,30);
		ff.setAccessible(true);
		System.out.println(Modifier.toString(ff.getModifiers())+"  "+ff.getType().getName()+"  "+ff.get(d));
		ff.set(d,30);
		System.out.println(Modifier.toString(ff.getModifiers())+"  "+ff.getType().getName()+"  "+ff.get(d));

		for(Field f:field)
		{	//f.setAccessible(true);
			System.out.println(Modifier.toString(f.getModifiers())+"  "+f.getType().getName());
		}

	}

}