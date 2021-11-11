package java09;

class CRational {// 分數類別
	int n;
	int d;

	public void setN(int num) { // 設定分子
		n = num;
	}

	public void setD(int num) { // 設定分母
		d = num;
	}

	public void show() { // 顯示分數
		System.out.println(n + "/" + d);
	}

	public void setND(int num, int den) {
		n = num;
		d = den;
	}
}

public class Class10a {
	public static void main(String[] args) {
		CRational aaa = new CRational();
		CRational bbb = new CRational();
		aaa.setN(2); // 分子
		aaa.setD(5); // 分母
		aaa.show();
		bbb.setND(1, 4); // 分子和分母
		bbb.show();
	}

}
