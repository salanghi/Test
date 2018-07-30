package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] strs;
    
        while((str = br.readLine()) != null){
            strs = str.trim().split(" ");
            int[] input = new int[strs.length];
            for(int i = 0; i < strs.length; ++i){
            	input[i] = Integer.parseInt(strs[i]);            	
            }
           
            String result = "";
            for(int i = input[0]; i <= input[1];i++){
            	if(isTrue(i)){
            		result = result + " " + i;
            	}
            }
            if(!"".equals(result)){
            	System.out.println(result.trim());
            }else{
            	System.out.println("no");
            }
        }
    }
	
	public static boolean isTrue(int i){
		return Math.pow((i/100), 3)+Math.pow(((i%100)/10), 3)+Math.pow((i%10), 3) == i;
	}
}
