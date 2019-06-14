package queue;

public class Queue 
{
int queue[]=new int[5];
int size=0;
int front=0;
int rear=0;

public void enQueue(int data)
{
	if(!isFull()) {
	queue[rear]=data;
	rear=(rear+1)%5;
	if(size<=5) {
	size=size+1;}
	}
	else
	{
		System.out.println("Queue is full for addition of "+ data);
	}
}

public int deQueue()
{
	int data=0;
	if(!isEmpty()) {
	data=queue[front];
	//queue[front]=queue[front+1];
	front=(front+1)%5;
	size--;
	
	}
	else
		System.out.println("Queue is Empty");
	return data;
}

public void show()
{
	System.out.print("Elements: ");
	for(int i=0;i<size;i++ )
	{
		System.out.print(queue[(front+i)%5]+ " ");
	}
	System.out.println();
}

public int getSize()
{
	return size;
}

public boolean isEmpty()
{
	return getSize()==0;
}

public boolean isFull()
{
	return getSize()==5;
}
}
