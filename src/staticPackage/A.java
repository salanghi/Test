
package staticPackage;

public class A {
	static{
		System.out.println("父静态代码块");
	}
	{
		System.out.println("父代码块");
	}
	public A() {
		System.out.println("父构造方法");
	}
}
