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
		System.out.println("1���� "+(i-1)+"���� �� : "+sum);
		
		for(int j=2;j<=9;j++){
			for(int k=1;k<=9;k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
		*/
		//�Ҽ����ϱ� ī��Ʈ �Լ� �߰��� �������� ����
		  	int b =0;
			for(int m=2;m<=100;m++){
			int a = 0;
			for(int n=2;n<m;n++){
				if (m%n==0){
					a +=1;
					break;		//break �߰��� for���� �߰����X ������ Ƚ�� ����
				}
			}
			if (a==0){
					System.out.println(m+"�� �Ҽ��̴�.");
					b +=1;
				}
			}
			System.out.println("�Ҽ��� ������ "+b+"�� �Դϴ�.");
			
		}
		
		//�Ҽ����ϱ�
		/*int primeCount = 0;
		for(int a=1;a<=100;a++){
			int count = 0;
			for(int k=1;k<=a;k++){
				if(a%k==0){
					count +=1;
				}
			}
			if (count==2){
				System.out.println(a+"�� �Ҽ��Դϴ�.");
				primeCount += 1;
			}
		}
		System.out.println("�Ҽ��� ������ "+primeCount+"�� �Դϴ�.");*/
	}

