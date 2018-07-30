package liu;

import java.util.HashMap;

public class JSingleNumber {
	public static void main(String[] args) {
		int[] A =  {1,2,2,1,5,4,3};
		for(Object i:singleNumber(A)){
			System.out.println(i);
		}
	}
	public static Object[] singleNumber(int[] A) {
		if (A.length == 0) {
			return new Object[A.length];
		}
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		//No.1
		//开始写代码，请在这里实现左侧需求中的问题
		HashMap<Integer,Integer> hashMap1 = new HashMap<Integer,Integer>();
		for( int i = 0;i< A.length ; i++){
			if(hashMap1.get(A[i]) != null){
				hashMap1.put(A[i], 2);
			}else{
				hashMap1.put(A[i], 1);				
			}
		}
		for(int i : hashMap1.keySet()){
			if(hashMap1.get(i) == 1){
				hashMap.put(i, 1);
			}
		}
		//end_code
		Object[] array = hashMap.keySet().toArray() ;
		return array;
	}
}
