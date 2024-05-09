public class Example7{
	static int x=5;
	static {
		System.out.println(x++);
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("Main Block");
	}

}