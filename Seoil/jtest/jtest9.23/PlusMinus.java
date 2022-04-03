class PlusMinus {
	int add, sub;
	public String plus(int x, int y) {
		add = x + y;
		return "두수의 합은" + add;
	}
	public String minus(int x, int y) {
		sub = x - y;
		return "두수의 차는" + sub;
	}
}
