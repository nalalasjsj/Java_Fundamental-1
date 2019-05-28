package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//문자 표현법
		char a = 'q';
		
		//유니코드 표현법  '\u00000'
		char b = '\uBC15';
		char c = '\uC720';
		char d = '\uC740';
		
		System.out.println(a);
		System.out.print(b);
		System.out.print(c);
		System.out.println(d);
		
		//아스키코드 표현법
		char e = 97;
		System.out.println(e);
		
		//이스케이프 캐릭터 = 특수문자
		System.out.println("\n집\t싶");
		System.out.println("가\t다\n고");
		System.out.println("\nC:\\dev\\eclipse");
		
		// 문자열 중에서 ",\ 문자로 인식을 못함(2가지) '은 인식함
		// 인식하게 하려면 ",\ 앞에 \ 붙이면 됨 \", \\
		System.out.println("\"맥'북\"에어 팟");
		
		// ',\ char에서 인식 못함. \ 붙여야함 
		char f = '"';
		char g = '\'';
		char h = '\\';
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}
}
