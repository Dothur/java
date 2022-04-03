class MultiDiv extends PlusMinus {
	int gob;
	double nanum;
	public String multi(int x, int y) {
		gob = x*y;
		return "두수의 곱은" + gob;
	}
	public String div(int x, int y) {
		nanum = (double)x/y;
		return "두수의 나눈 값은" + nanum;
	}
}
public class FourRulesTest1 {
	public static void main(String[] args) {
		String splus, sminus, smulti, sdiv;
		MultiDiv ob1 = new MultiDiv();
		splus = ob1.plus(50,30);
		sminus = ob1.minus(50,30);
		smulti = ob1.multi(50,30);
		sdiv = ob1.div(50,30);
		System.out.println(splus);
		System.out.println(sminus);
		System.out.println(smulti);
		System.out.println(sdiv);
	}
}
