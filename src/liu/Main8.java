package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main8 {
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
       
        while((str = br.readLine()) != null){
        	String[] strs = str.split(" ");
        	int x = Integer.valueOf(strs[0]);
        	int y = Integer.valueOf(strs[1]);
        	int[][] data = new int[x][y];
        	for(int i = 0; i < x; i++){
        		data[i][0] = 1;
        	}
        	for(int i = 0; i < y; i++){
        		data[0][i] = 1;
        	}
        	for(int i = 1; i <= x; i++){
        		for(int j = 1; j <= y; j++){
        			data[i][j] = data[i-1][j]+data[i][j-1];
        		}
        	}
        	System.out.println(data[x][y]);        	
        }
    }
}
