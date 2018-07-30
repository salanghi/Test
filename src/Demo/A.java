package Demo;

public class A {
	int a = 1;
	int b = a;
	{
		b = a;
	}
	void print(){
		System.out.println("x");
	}
	void fun(){
		print();
	}
	class B{
		int d = a;
		void fun1(){
			print();
		}
	}
}
