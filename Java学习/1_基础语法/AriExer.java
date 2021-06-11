/* 随意给出一个三位数，打印显示它的个位数、十位数、百位数的值

例子
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/

public class AriExer{
	
	public static void main(String[] args){
		
		int num=153;
		int ge=num%10;
		int shi=(num/10)%10;
		int bai=num/100;
		System.out.println("数字"+num+"的情况如下：");
		System.out.println("个位数："+ge);
		System.out.println("十位数："+shi);
		System.out.println("百位数："+bai);
	}
}



