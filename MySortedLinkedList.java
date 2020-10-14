package com.capgemini.mylinkedlist;

public class MySortedLinkedList
{
	public INode head;
	public INode tail;
	public int size=0;
	public MySortedLinkedList() {
		this.head = null;
		this.tail = null;
	}	
	
	public void printMyNode()
	{
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode temporaryNode=head;
		while(temporaryNode.getNext()!=null)
		{
			myNodes.append(temporaryNode.getKey());
			if(!temporaryNode.equals(tail))
				myNodes.append("->");
			temporaryNode=temporaryNode.getNext();
		}
		myNodes.append(temporaryNode.getKey());
		System.out.println(myNodes);
	}
}
