//编程实现编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3

public class WanNumTest{
	public static void main(String[] args){
		
		for(int i = 1;i <=1000;i++){//打印出1000内所有数
			int num = 0;
			for(int j = 1;j < i;j++){  //将每个因子筛选出
				if(i % j == 0){
					num = num + j; //将所有因子相加
				}
			}
			if(i == num){//如果因子和与i值相等，则打印出
				System.out.println("1000内的完数有："+num);
			}
		}
	}
}