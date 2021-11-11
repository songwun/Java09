package java09;

class CCount {
	private static int cnt = 0;

	public CCount() {
		count();
	}

	public static void count() {
		cnt++; // 每建立一個物件，cnt的值便加 1
	}

	public static void setZero() {
		cnt = 0; // 初值設為 0
	}

	public static void setValue(int n) {
		cnt = n; // 物件建立的個數
	}

	public static void show() {
		System.out.println("cnt=" + cnt);
	}
}

public class Class05 {

	public static void main(String[] args) {
		CCount cn1 = new CCount(); // 物件一
		CCount cn2 = new CCount(); // 物件二
		CCount.show();
		CCount.setZero();
		System.out.println("using setZero()..."); // 呼叫時，cnt的值會被歸零
		CCount.show();
		CCount.setValue(10); // 設n=10
		System.out.println("using setValue(10)..."); // 呼叫時，cnt的值會被設為 n
		CCount.show();

	}

}
