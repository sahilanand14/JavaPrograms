class LinkList
{
	public Link first;
	public boolean isEmpty()
	{
		return first==null;
	}
	public void insertAtFront(int id)
	{
      Link newLink=new Link(id);
      newLink.next=first;
      first=newLink;

	}
	public Link deleteAtFront()
	{
		Link temp=first;
		first=first.next;
		return temp;

	}
	public String toString()
	{
		String str="";
		Link current=first;
		while(current!=null)
		{
			str+=current.toString();
			current=current.next;
		}
		return str;
	}

    public Link deleteNodeWithValue(int i)
    {
    	Link current =first;
    	Link previous=first;
    	while(current.data!=i)
    	{
    		if(current.next==null)
    		return null;
    	else
    	{
    		previous=current;
    		current=current.next;
    	
    	}
    	}
    	if(current==first)
    		first=first.next;
    	else
    		previous.next=current.next;
    	return current;
    }


    public Link find(int key)
    {
    	Link current=first;
    	while(current.data!=key)
    	{
    		if(current.next==null)
    			return null;
    		else
    			current=current.next;
    	}
    	return current;
    }








}