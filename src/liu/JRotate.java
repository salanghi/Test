package liu;

public class JRotate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(nums);
	}
	public static void rotate(int[][] nums) {
		if (nums == null ||nums.length == 0 || nums[0].length == 0)
			return ;
		int m = nums.length;
		int n = nums[0].length;
		//No.1
		//开始写代码，请在这写入你的代码。
		for(int i = 0;i<= (m-1)/2;i++){
			for(int j = i; j < n; j++){
				int temp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		for(int i = 0;i < m; i++){
			for(int j = 0; j <= (n-1)/2; j++){
				int temp = nums[i][j];
				nums[i][j] = nums[i][n-j-1];
				nums[i][n-j-1] = temp;
			}
		}
		//end_code
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
