class A {
	public int aa = 1;
}
class B extends A {
	private int bb = 2;
	public int bb() {
		return bb;
	}
}
class C extends B {
	int cc = 3;
}
public class InheritanceTest1 {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc객체의 객체 속성변수 aa의 값은 " + objc.aa);
		System.out.println("objc객체의 객체 속성변수 bb의 값은 " + objc.bb());
		//objc.bb 에 접근하면 오류 발생
		System.out.println("objc객체의 객체 속성변수 cc의 값은 " + objc.cc);
	}
}

