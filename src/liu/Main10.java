package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10 {
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
       
        while((str = br.readLine()) != null){
        	int n = Integer.valueOf(str);
        	int sum = 0;
        	for(int i = 2; i < n; i++){//i进制各位数之和
        		int cur = n;
        		while(cur>0){
        			sum += cur%i;
        			cur = cur/i;        			
        		}
        	}
        	
        	int a = sum;
        	int b = n - 2;
        	
        	int c = 1;
        	while( a % b > 0){
        		c = a % b;
        		a = b;
        		b = c;
        	}
        	
        	System.out.println(sum/b+"/"+(n-2)/b);
        	
        }
    }
}
