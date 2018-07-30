package liu;

import static java.lang.System.out;
import static java.lang.Integer.*;

import staticPackage.StaticDemo;

public class StaticImport {
	static int a = 1;
	
	static{
		a++;
	}
	
	int b = 1;
	{
		b++;
	}
	
	static class C{
		int age = 19;
	}
	
	public static void main(String[] args) {

		StaticDemo s = new StaticDemo();
		out.println(a);
		StaticImport i = new StaticImport();
		StaticImport o = new StaticImport();
		out.println(i.b);
		out.println(o.b);
		C c1 = new C();
		c1.age = 20;
		System.out.println(c1.age);
		C c2 = new C();
		System.out.println(c2.age);
		StringBuffer sb = null;
	}
}
