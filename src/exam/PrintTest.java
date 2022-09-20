package exam;

public class PrintTest {
	public static void main(String[] args) {
		System.out.printf("이름\t국어\t영어\t수학\n");
		System.out.println("============================");
		System.out.println("홍길동\t70\t80\t90");
		
		System.out.println("10"+20);
		System.out.println(10+20);
		System.out.println(10+20+"가");
		System.out.println("가"+10+20);
		System.out.println("가"+ (10+20)); //가30
	}

}
