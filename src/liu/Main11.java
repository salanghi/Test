package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        br.readLine();
        String a = br.readLine();
        String[] b = a.split(" ");
        int[] c = new int[b.length];
        
        int maxVal = 0;
        int maxValIndex = 0; 
        for(int i = 0; i < b.length; i++){
        	c[i] = Integer.valueOf(b[i]);
        	if(c[i] > maxVal){
        		maxVal = c[i];
        		maxValIndex = i;
        	}
        }
        
        int[] d = new int[b.length];
        for(int i = maxValIndex + 1; i < c.length; i++){
        	d[i - maxValIndex - 1] = c[i];
        }
        for(int i = 0; i < maxValIndex + 1; i++){
        	d[i + (c.length - maxValIndex - 1)] = c[i];
        }
 
        int result = 0;
        for(int i = 0; i < c.length; i++){
        	for(int j = i + 1; j < c.length; j++){
        		if(j == i + 1){
        			result++;
        			continue;
        		}
        		boolean flag = true;
        		for(int k = i + 1; k < j; k++){
        			if(d[k] > d[i] || d[k] > d[j]){
        				flag = false;
        				continue;
        			}
        		}
        		if(flag){
        			result++;
        		}
        	}
        }
        if(d[0] != d[d.length-1]){
        	result++;
        }
        System.out.println(result);
    }
}
