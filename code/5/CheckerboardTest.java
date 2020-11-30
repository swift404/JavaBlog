public class CheckerboardTest{
	public static void main(String[] args){
		//1、看到数字和字母的一瞬间，第一反应是用asc码打印，ASCII 48~57,97~102，43，0
		//2、两个for循环，第一个for循环中：第0个打印0，然后循环10次48~57，再循环10次97~120
		//创建数组用以遍历
		int[] arr = {0,48,49,50,51,52,53,54,55,56,57,97,98,99,100,101,102};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				//第一行打印数组顺序内容
				if(0==i){
					char num = (char)arr[j];
					System.out.print(num+" ");
				//第一列打印数组顺序内容
				}else if(0==j){
					char num = (char)arr[i];
					System.out.print(num+" ");
				}else{
					System.out.print("+" +" ");
				}
			}
			System.out.println();
			
			
		}
	}
}