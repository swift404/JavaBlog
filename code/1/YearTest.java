//编程实现输入年月日计算是当年的那一天
import java.util.Scanner;

public class YearTest{
	
	public static void main(String[] args){
		//1.提示用户输入年月日
		Scanner sc = new Scanner(System.in);//键盘扫描器
		int year ;
		int month;
		int day;
		System.out.println("请输入年：");
		year = sc.nextInt();
		System.out.println("请输入月：");
		month = sc.nextInt();
		while(month < 1 || month > 12){            //将月份控制在正常范围，如输入错误可进行提醒（只进行一次提醒）
			System.out.println("您输入的月份有问题");
			System.out.println("请重新输入月份（1~12）");
			month = sc.nextInt();
			break;
		}
		System.out.println("请输入日期：");
		day = sc.nextInt();
		while(day < 1 || day > 31){  				//将日期控制在正常范围，如输入错误可进行提醒（只进行一次提醒）
			System.out.println("您输入的日期有问题");
			System.out.println("请重新输日期（1~31）");
		    day = sc.nextInt();
		break;
		}
		int[] arrrun = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		int[] arrping = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};//将闰/平年的每月天数列举出来，直接通过for循环计算
		int sum = 0;//初始化sum ，将天数存放在sum内，以便于进行计算
		if(year % 4 == 0 ){//如果是闰年则进行下列计算，反之则按平年计算。
			for(int i = 0; month -1 > i;i++){
				sum = sum + arrrun[i] ;//将输入月份之前所有天数的总和放在sum
			}
			sum += day;//将输入月份的天数和输入月份之前所有天数相加赋值给sum
			System.out.println("这是今年的第"+sum+"天");			
		}
		else{
			for(int i = 0; month -1 > i ;i++){     //平年天数计算
				sum = sum + arrping[i] ;
			}
			sum += day;
			System.out.println("这是今年的第"+sum+"天");
		}			
	}	
}

