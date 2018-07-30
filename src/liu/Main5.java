package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
    
        while((str = br.readLine()) != null){
            str = str.replace(" ", "");
            if(str.length() > 14){
            	System.out.println(str.substring(0, 6)+" "+str.substring(6,14)+" "+str.substring(14));
            }else if(str.length() > 6){
            	System.out.println(str.substring(0,6)+" "+str.substring(6));
            }else{
            	System.out.println(str);
            }
        }
    }
}
