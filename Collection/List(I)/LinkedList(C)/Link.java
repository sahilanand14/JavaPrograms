class Link
{
	Link next;
	int data;
	Link(int data)
	{
		this.data=data;
	}
	public String toString()
	{
		return "{ "+ data +" }";
	}
}
