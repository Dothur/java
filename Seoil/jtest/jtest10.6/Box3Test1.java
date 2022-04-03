class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	public Box3() {
		idNum = ++boxID;
	}
}
class Box3Test1 {
public static void main(String[] args) {
	Box3 mybox1 = new Box3();
	Box3 mybox2 = new Box3();
	Box3 mybox3 = new Box3();
	Box3 mybox4 = new Box3();
	Box3 mybox5 = new Box3();  // 객체가 생성될때 마다 생성자 idNum = ++boxID 수행
							   // 그래서 mybox1부터 1 2 3 쭉 idNum 값에 배정됨
	System.out.println("mybox5의 id 번호 : " + mybox5.idNum);

	System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
	System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
	System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
	System.out.println("mybox4의 id 번호 : " + mybox4.boxID); //boxID는 클래스 변수이기때문에
	//boxID 값은 모든 객체가 값을 공유하므로 mybox5까지 늘리게 되면 mybox4객체의 boxID값은 5가 된다.
	System.out.println("마지막 생성된 박스 번호는 " + Box3.boxID + "번 입니다.");
	}
}

