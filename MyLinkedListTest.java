package com.capgemini.mylinkedlist;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest
{
	@Test
	public void givenNumbersWhenAdded_ToLinkedList_ShouldBeAddedToTop() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.add(mySecondNode);
    	myLinkedList.add(myThirdNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myThirdNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myFirstNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenNumbersWhenAppended_ToLinkedList_ShouldBeAddedToLast() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(mySecondNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenNumbersWhenInsertingInBetween_ToLinkedList_ShouldPass() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenFirstNumber_WhenDeleted_ShouldPass() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.pop();
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenLinkedList_WhenLastElementDeleted_ShouldPass() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.popLast();
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.tail.equals(mySecondNode);
    	Assert.assertTrue(result);
	}
}
