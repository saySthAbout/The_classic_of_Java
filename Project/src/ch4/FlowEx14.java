package ch4;

public class FlowEx14 {
	public static void main(String[] args){
		
//		for(int i=1,j=10;i<=10;i++,j--)
//			System.out.printf("%d \t %d%n", i, j);
		// 위 for문의 결과와 같은 값을 하나의 변수만으로도 얻을 수 있다.
		// i + j = 11 -->  j = 11 - i
		
		for(int i=1; i<=10;i++){
			System.out.printf("%d \t %d%n", i, 11-i);
		}
		
	}
}
