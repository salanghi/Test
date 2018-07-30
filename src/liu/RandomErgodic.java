package liu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomErgodic {
	public static void main(String[] args) {
		int number[] = new int[100];
		int index;// 随机遍历数据
		for (int i = 0; i < 100; i++) {// 初始化
			number[i] = i;
		}
		//No.1
		//开始写代码，补充完整代码，在此写入实现代码
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {// 初始化
			list.add(i);
		}
		Collections.shuffle(list);
		for(int i : list){
			System.out.println(i);
		}
		//end_code
	}
}
