package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String line = br.readLine();
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < line.length(); i++ ){
        	char chr = line.charAt(i);
        	if(chr < 65 || chr > 122 || (chr > 90 && chr < 97)){
        		continue;
        	}
        	String cur = String.valueOf(chr);
        	if(map.get(cur) == null){
        		map.put(cur, 1);
        	}else{
        		map.put(cur, map.get(cur)+1);
        	}
        	if(map.get(cur) == 3){
        		System.out.println(cur);
        		break;
        	}
        }
    }
}
