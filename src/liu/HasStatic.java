package liu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HasStatic {
	public static void main(String args[]) {
//		System.out.println(Sum_Solution(5));
//		int[] array = {2,4,3,6,3,2,5,5};
//		FindNumsAppearOnce(array,null,null);
		System.out.println(FirstNotRepeatingChar(""));
	}
	
    public static int FirstNotRepeatingChar(String str) {
    	if(str.length() == 0){
    		return -1;
    	}
    	String[] array = str.split("");
    	Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        for(int i = 0; i < array.length; i++){
        	if (map.get(array[i]) != null) {
				map.put(array[i], 2);
			}else{
				map.put(array[i], 1);
			}
        }
        for(String key : map.keySet()){
        	if(map.get(key) == 1){
        		return str.indexOf(key);
        	}
        }
        return -1;
    }
	
//    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0; i < array.length; i++){
//        	if (map.get(array[i]) != null) {
//				map.put(array[i], null);
//			}else{
//				map.put(array[i], 1);
//			}
//        }
//        for(Integer key : map.keySet()){
//        	if(map.get(key) != null){
//        		return key;
//        	}
//        }
//    }
	
//    public static int Sum_Solution(int n) {
//    	int re = n;
//        boolean b = (n > 0) && ((re += Sum_Solution(n-1)) > 0);
//        return re;
//    }
//	
//    public static int Fibonacci(int n) {
//        int f = 0, g = 1;
//        while(n-- > 0) {
//            g += f;
//            f = g - f;
//        }
//        return f;
//    }
//    
//    public int MoreThanHalfNum_Solution(int [] array) {
//    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0; i < array.length; i++){
//        	if(map.get(array[i]) != null){
//        		map.put(array[i], map.get(array[i])+1);
//        	}else{
//        		map.put(array[i], 1);
//        	}
//        }
//        for(Integer i : map.keySet()){
//        	if(map.get(i) * 2 > array.length){
//        		return i;
//        	}
//        }
//    	return 0;
//    }
}
