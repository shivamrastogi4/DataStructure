/*import java.util.LinkedList;*/

public class Runner {

	public static void main(String[] args)
	{
		/*LinkedList list=new LinkedList();
		list.add(5);
		list.add(3,12);  Dont have to use by default implementation available, will make our own class
		list.iterator();*/
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(121);
		list.insertAt(2,13);
		list.insertAt(3,23);
		list.deleteAt(3);
		list.show();
	}
	
}
