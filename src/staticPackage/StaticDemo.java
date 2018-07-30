package staticPackage;

public class StaticDemo extends A{
	static{
		System.out.println("静态代码块");
	}
	{
		System.out.println("代码块");
	}
	public StaticDemo() {
		System.out.println("构造方法");
	}
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
	}
}
