package java_20190528;

public class OperatorDemo {
	public static void main(String[] args) {
		/*�޷¸����
		 * 1. 1�� 1�� 1�� ������
		 * 2. ������ 4�� ���� �߻�, 100�� ����� ���� but 400�� ����� ���� X 
		 * 2019�� 5�� 28���� ������ ���Ϸ��� 2018�� ���� �� �ϼ��� ���ϰ�, 1-4���� �ϼ� ���ϰ� 28 ���ϸ� �� �ϼ�
		 * %7 �� ��, 0 �Ͽ���, 1 ������ ... 6 �����
		 */
		int year = 2020;
		int month = 5;
		int date = 28;
		
		int preYear = year - 1;
		int preMonth = month - 1;
		
		int totalCnt = 0;
		
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		// 2019�� 1�� 1�Ϻ��� 4�� 30�ϱ��� �ϼ� ���ϱ�
		totalCnt += 31+28+31+30;
		
		totalCnt++;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		
		int a = 10;
		//��� �Ŀ� ���� a=10
		System.out.println(a++);
		//���� �Ŀ� ��� , �̹� ������ ��� �� ���������Ƿ� a=11�ε� �� ���� �� ����̹Ƿ� a=12
		System.out.println(++a);
		
		//���ǿ����� = ���׿�����
		//�Ʒ��� ���ǹ��� ���� �Խ����� �������� ������ �� ��� , �Խñۼ�temp�� ��������share����
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 +1;
		
		System.out.println(share);
		
		//���� ���ǹ��� ������ ������ if������ ǥ��
		if(temp%10==0){
			share = temp/10;
		}else{
			share = temp/10 +1;
		}
		System.out.println(share);
		
		
	}
}
