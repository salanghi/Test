package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] strs;
        int[] prices = new int[100000];
        while((str = br.readLine()) != null){
            strs = str.trim().split(" ");
            int[] input = new int[strs.length];
            for(int i = 0; i < strs.length; ++i){
            	input[i] = Integer.parseInt(strs[i]);            	
            }
           
            for(int i = input[0]; i<= input[1]; i++){
            	prices[i] = input[2];
            }
        }
        
        boolean flag = false;
        int curStart = 0;
        int cur = 0;
        for(int i=0; i<100000; i++){
        	if(prices[i] != cur){
        		if(i>0 && prices[i-1] != 0){
        			if(flag){
        				System.out.print(",");
        			}
        			flag = true;
        			System.out.print("["+curStart+", "+(i-1)+", "+prices[i-1]+"]");
        		}
        		curStart = i;
        	}
        	cur = prices[i];
        }
    }
}
