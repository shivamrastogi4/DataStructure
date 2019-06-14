package stack;

public class Stack 
{
	int arr_size=5;
	int stack[]=new int[arr_size];
	int top=0;
	public void push(int data)
	{
		if(top<arr_size)
		{
			stack[top]=data;
			top++;
			
		}
		else {
			System.out.println("Stack is already full!!");	
			
		}
	}
	
	public void pop() 
	{
		if(top==0)
		{
			System.out.println("Stack is currently empty");
		}
		else
		{
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
	}
	}
	
	public boolean isEmpty(){
		return top<=0;
		
	}
	public int peek() 
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	public void size()
	{
		System.out.println("Size of Stack currently is "+ top);
	}
	
	public void show()
	{
 		for(int n: stack)
		{
			System.out.print( n+ "  ");
		}
 		System.out.println();
	}
}
