class MyLinkList
{
	public static void main(String...s)
	{
		LinkList al=new LinkList();
		System.out.println(al.isEmpty());
		al.insertAtFront(10);
		al.insertAtFront(20);
		System.out.println(al.isEmpty());
		System.out.println(al);
		al.insertAtFront(40);
		al.insertAtFront(50);
		al.insertAtFront(60);
		System.out.println(al);
		al.deleteAtFront();
		System.out.println(al);
		al.insertAtFront(80);al.insertAtFront(120);
		System.out.println(al.deleteNodeWithValue(40));
		System.out.println(al.find(800));
		System.out.println(al);
			


	}
}