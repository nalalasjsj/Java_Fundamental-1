package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		
		//byte ������ �Ѿ�� ���� �߻�
		// but �������������� circuit �߻� -128 ���
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double�� ĳ�����ϴ� ��� �Ҽ��� ���� ©��
		//cut �߻� 42 ���
		int b = (int)42.5;
		System.out.println(b);
		
		//�����ִ� �� �Ѵ� ĳ��������� �� 
		//���Ұ��  int�� �ν� 10���� ���, int�� double�� ��ȯ�ص� 10.0���
		double c = 42/4;
		
		int totalCount = 42;
		int memberCount = 4;
		
		double d = (double)totalCount/(double)memberCount;
		
		System.out.println(c);
		System.out.println(d);
		
		
	}
}
