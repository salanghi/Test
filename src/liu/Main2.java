package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String number = br.readLine();
        int cutLen = Integer.valueOf(br.readLine());
        
        for(int i = 0; i < cutLen; i++){
        	boolean flag = true;
        	for(int j = 0; j < number.length() - 1; j++){
        		if (number.charAt(j) < number.charAt(j + 1)) {
        			flag = false;
					number = number.substring(0, j) + number.substring(j+1,number.length());
					break;
				}
        	}
        	if(flag){
        		number = number.substring(0,number.length()-1);
        	}
        }
        System.out.println(number);
    }
}
