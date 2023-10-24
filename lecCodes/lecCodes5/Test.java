public class Test {
	static int x = 11;
	private int y = 33;
	
	public void method1(int x)
	{
		Test t = new Test();
		this.x = 22;
		y = 44;

		System.out.println("Test X:");
		System.out.println("T.X:" + t.x);
		System.out.println("T.Y:" + t.y);
		System.out.println("  Y:" + y);
	}

	public static void main(String args[]) 
	{
		Test t = new Test();
		t.method1(15);
	}
}
