package stack;

public class Runner {

	public static void main(String[] args) {
		DynamicStack nums=new DynamicStack();
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();
		//System.out.println(nums.peek());
		nums.push(12);
		nums.show();
		nums.push(121);
		nums.show();
		nums.push(123);
		nums.show();
		nums.push(112);
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		//nums.size();
		//System.out.println("Empty Status " + nums.isEmpty());
	}

}
