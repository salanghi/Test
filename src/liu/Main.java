package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.valueOf(str);//n个点
        
        List<int[]> list = new ArrayList<int[]>();
        while((str = br.readLine()) != null){
        	String[] strs = str.split(" ");
        	int[] dot = new int[4];
        	for(int i = 0 ; i < strs.length; i++){
        		dot[i] = Integer.valueOf(strs[i]);
        	}
        	list.add(dot);
        }
        
        //计算距离最远两点
        int[] a;
        int[] b;
        
        
    }
}
