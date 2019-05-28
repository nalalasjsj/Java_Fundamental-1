package java_20190528;

public class OperatorDemo {
	public static void main(String[] args) {
		/*달력만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 윤년은 4년 마다 발생, 100의 배수는 제외 but 400의 배수는 제외 X 
		 * 2019년 5월 28일의 요일을 구하려면 2018년 까지 총 일수를 구하고, 1-4월의 일수 구하고 28 더하면 총 일수
		 * %7 한 뒤, 0 일요일, 1 월요일 ... 6 토요일
		 */
		int year = 2020;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		
		int totalCnt = 0;
		
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		// 2019년 1월 1일부터 4월 30일까지 일수 구하기
		totalCnt += 31+28+31+30;
		
		totalCnt++;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		
		int a = 10;
		//출력 후에 증가 a=10
		System.out.println(a++);
		//증가 후에 출력 , 이미 위에서 출력 후 증가했으므로 a=11인데 또 증가 후 출력이므로 a=12
		System.out.println(++a);
		
		//조건연산자 = 삼항연산자
		//아래의 조건문은 보통 게시판의 페이지수 관리할 때 사용 , 게시글수temp로 페이지수share결정
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 +1;
		
		System.out.println(share);
		
		//위의 조건문과 동일한 연산을 if문으로 표현
		if(temp%10==0){
			share = temp/10;
		}else{
			share = temp/10 +1;
		}
		System.out.println(share);
		
		
	}
}
