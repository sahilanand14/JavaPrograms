class Demo
{
	public static void main(String[] args) {
			Demo d=new Demo();
			Demo d1=new Demo();
			System.out.println(d.equals(d1));


	}
	public int hashCode()
	{
		return 12;
	}
	public boolean equals(Object obj)
	{
		return this.hashCode()==((Demo)obj).hashCode();
	}
}