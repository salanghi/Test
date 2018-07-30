package A;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
//		int re = NumberOf1Between1AndN_Solution(1300000);
//		System.out.println(re);
//		System.out.println(LeftRotateString("",6));
//		System.out.println(ReverseSentence("I am a student."));
		System.out.println((3&2)<<1);
	}
	
	
	
	public int Add(int num1, int num2) {
		BigInteger bi1 = new BigInteger(String.valueOf(num1));
		BigInteger bi2 = new BigInteger(String.valueOf(num2));
		return bi1.add(bi2).intValue();
	}
	
    public static String ReverseSentence(String str) {
    	if(" ".equals(str)){
    		return " ";
    	}
    	String[] strArr = str.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for(int i = strArr.length - 1; i >= 0; i--){
    		sb.append(strArr[i]+" ");
    	}
    	return sb.toString().trim();
    	
//    	char[] strArr = str.toCharArray();
//    	int len = strArr.length;
//    	char[] newArr = new char[len];
//    	for(int i = 0; i < strArr.length; i++){
//    		newArr[i] = strArr[len-i-1];
//    	}
//    	return new String(newArr);
    }
	
	public static boolean duplicate(int numbers[],int length,int [] duplication) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	    for(int i = 0; i < length; i++){
	    	if (map.get(numbers[i]) != null) {
	    		duplication[0] = numbers[i];
				return true;
			}
	    	map.put(numbers[i], 1);
	    }
		return false;
    }
	
	public static String LeftRotateString(String str,int n) {
		if("".equals(str)){
			return "";
		}
        for(int i = 0; i < n; i++){
        	str = str.substring(1)+str.substring(0, 1);
        }
        return str;
    }
	
	public static int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
	    for(int i = 1; i <= n; i++){
	    	count += String.valueOf(i).length()-String.valueOf(i).replace("1", "").length();
	    }
		return count;
    }
	
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	int a = 0;
    	int b = 0;
    	int ji = Integer.MAX_VALUE;
    	int len = array.length;
    	for(int i = 0; i < len; i++){
    		for(int j = i + 1; j < len; j++){
    			if(array[i] + array[j] == sum){
    				if(array[i]*array[j] < ji){
    					a = array[i];
    					b = array[j];
    					ji = array[i]*array[j];
    				}
    			}
    		}
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(ji != Integer.MAX_VALUE){
    		list.add(Integer.valueOf(a));
    		list.add(Integer.valueOf(b));    		
    	}
    	return list;
    }
}
