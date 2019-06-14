package queue;

public class Runner {

	public static void main(String[] args) {
		Queue que=new Queue();
		que.enQueue(5);
		que.enQueue(52);
		que.enQueue(15);
		que.enQueue(25);
		que.enQueue(35);
		/*System.out.println(que.deQueue());
		System.out.println(que.deQueue());*/
		que.show();
		que.enQueue(32);
		que.enQueue(45);
		que.show();
		System.out.println(que.getSize());
	}

}
