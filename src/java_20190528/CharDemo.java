package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//���� ǥ����
		char a = 'q';
		
		//�����ڵ� ǥ����  '\u00000'
		char b = '\uBC15';
		char c = '\uC720';
		char d = '\uC740';
		
		System.out.println(a);
		System.out.print(b);
		System.out.print(c);
		System.out.println(d);
		
		//�ƽ�Ű�ڵ� ǥ����
		char e = 97;
		System.out.println(e);
		
		//�̽������� ĳ���� = Ư������
		System.out.println("\n��\t��");
		System.out.println("��\t��\n��");
		System.out.println("\nC:\\dev\\eclipse");
		
		// ���ڿ� �߿��� ",\ ���ڷ� �ν��� ����(2����) '�� �ν���
		// �ν��ϰ� �Ϸ��� ",\ �տ� \ ���̸� �� \", \\
		System.out.println("\"��'��\"���� ��");
		
		// ',\ char���� �ν� ����. \ �ٿ����� 
		char f = '"';
		char g = '\'';
		char h = '\\';
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}
}
