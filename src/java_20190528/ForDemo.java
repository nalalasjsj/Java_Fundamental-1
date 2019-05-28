package java_20190528;

public class ForDemo {
	public static void main(String[] args){
		/*int sum = 0;
		int i=1;
		for(;i<=100;i++){
			if (i%2==1){
			sum += i;
			}
		}
		System.out.println("1부터 "+(i-1)+"까지 합 : "+sum);
		
		for(int j=2;j<=9;j++){
			for(int k=1;k<=9;k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
		*/
		//소수구하기 카운트 함수 추가를 생각하지 못함
		  	int b =0;
			for(int m=2;m<=100;m++){
			int a = 0;
			for(int n=2;n<m;n++){
				if (m%n==0){
					a +=1;
					break;		//break 추가로 for구분 추가계산X 돌리는 횟수 감소
				}
			}
			if (a==0){
					System.out.println(m+"은 소수이다.");
					b +=1;
				}
			}
			System.out.println("소수의 개수는 "+b+"개 입니다.");
			
		}
		
		//소수구하기
		/*int primeCount = 0;
		for(int a=1;a<=100;a++){
			int count = 0;
			for(int k=1;k<=a;k++){
				if(a%k==0){
					count +=1;
				}
			}
			if (count==2){
				System.out.println(a+"는 소수입니다.");
				primeCount += 1;
			}
		}
		System.out.println("소수의 개수는 "+primeCount+"개 입니다.");*/
	}

