package java09;

class CRectangle {
	int width;
	int height;

	public CRectangle(int w, int h) { // 呼叫時可以提供引數的建構元
		width = w;
		height = h;
		System.out.println("constructor CRectangle(int w,int h) called");
	}

	public CRectangle() { // 沒有引數的建構元
		width = 10;
		height = 8;
		System.out.println("constructor CRectangle() called");
	}

	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}
}

public class Class01a {
	public static void main(String[] args) {
		CRectangle rec1 = new CRectangle(1, 2); // 建構元呼叫時,設定w和h的值
		rec1.show();
		CRectangle rec2 = new CRectangle();
		rec2.show();
	}
}
