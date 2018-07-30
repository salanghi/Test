package liu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main7 {
	static int[] mianzhi = {1,5,10,20,50,100};
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
       
        while((str = br.readLine()) != null){
           int sum = Integer.valueOf(str);
           System.out.println(check(sum, 5));
        }
    }
	
	public static long check(int sum,int index){
		int max = mianzhi[index];
		if(sum == 0){
			return 1;
		}
		if(max == 1){
			return 1;
		}
		if(sum < max){
			return check(sum, index - 1);
		}
		return check(sum-max, index)+check(sum, index - 1);
	}
}
