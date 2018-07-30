package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main9 {
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
       
        while((str = br.readLine()) != null){
        	if("".equals(str)){
        		continue;
        	}
           int sum = Integer.valueOf(str);
           int[] mianzhi = {1,5,10,20,50,100};
           long[] data = new long[sum+1];
           for(int i = 0; i < data.length; i++){
        	   data[i] = 1;
           }
           for(int i = 1; i < mianzhi.length; i++){
        	   for(int j = 1; j<=sum; j++){
        		   if(j >= mianzhi[i]){
        			   data[j] = data[j]+data[j-mianzhi[i]];        			   
        		   }
        	   }
           }
           System.out.println(data[sum]);
        }
    }
}
