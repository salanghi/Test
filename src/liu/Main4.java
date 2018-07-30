package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {
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
           
            double result = input[0];
            double now = result;
            for(int i = 1; i < input[1]; i++){
            	now = Math.sqrt(now);
            	result = result + now;
            }
            System.out.println(String.format("%.2f", result));
        }
    }
}
