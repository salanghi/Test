package mianshiDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
//		InterfaceDemo interfaceDemo = new InterfaceDemo() {
//
//			@Override
//			public void doSomeThing() {
//				// TODO Auto-generated method stub
//				System.out.println("do");
//			}
//		};
//		System.out.println(InterfaceDemo.a);
//		interfaceDemo.doSomeThing();
		char a = '来';
		System.out.println(a);
		System.out.println(new StringBuffer("abc").equals(new StringBuffer("abc")));
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		for(int i = 0;i < 100; i++){
			list.add(new StringBuffer("StringBuffer"+i));
		}
		for(StringBuffer sb : list){
			System.out.println(sb);
		}
	}
}
