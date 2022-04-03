class Box10 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	private static long boxID;

	public Box10(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		volume();
	}
	private void volume()
	{
		vol = width * height * depth;
	}
	public String getvolume() 
	{
		return idNum + "번 박스의 부피:" + vol;
	}
	public static long getCurrentID() {
		//return idNum;  클래스메소드이기 때문에 멤버변수 사용 X
		return boxID;
	}
}
public class Box10Test1 {
	public static void main(String[] args) {
		Box10 mybox1;
		for(int i=1; i<=5; i++) {
			mybox1 = new Box10(i,i+1,i+2);
			System.out.println(mybox1.getvolume());
		}
		System.out.println("마지막 생성된 박스 번호는" + Box10.getCurrentID() + "번입니다");
		//System.out.println(Box10.boxID);  클래스변수가 private 지정자로 선언되어 있어서 오류발생
	}
}

