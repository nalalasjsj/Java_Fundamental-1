package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		
		//byte 범위를 넘어가면 에러 발생
		// but 에러방지했지만 circuit 발생 -128 출력
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double로 캐스팅하는 경우 소수점 이하 짤림
		//cut 발생 42 출력
		int b = (int)42.5;
		System.out.println(b);
		
		//나눠주는 수 둘다 캐스팅해줘야 함 
		//안할경우  int로 인식 10으로 출력, int를 double로 변환해도 10.0출력
		double c = 42/4;
		
		int totalCount = 42;
		int memberCount = 4;
		
		double d = (double)totalCount/(double)memberCount;
		
		System.out.println(c);
		System.out.println(d);
		
		
	}
}
