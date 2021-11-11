package java09;

class CRational { // 分數類別
	public int n;
	public int d;
	public void setND(int num, int den) {
		n = num;
		d = den;
	}
	public CRational sub(CRational r1, CRational r2) {
		CRational obj = new CRational();
		obj.n = r1.n * r2.d - r1.d * r2.n;
		obj.d = r1.d * r2.d;
		return obj;
	}
	public boolean larger(CRational r) {
		CRational obj = new CRational();
		obj = sub(this, r);
		if (obj.n < 0 || obj.d < 0)
			return false;
		else
			return true;
	}
}

public class Class13 {

	public static void main(String[] args) {
		CRational aaa=new CRational(); 
		CRational bbb=new CRational(); 
		boolean flag; 
		aaa.setND(1, 5); 
		show(aaa); 
		System.out.println(); 
		bbb.setND(2, 3); 
		show(bbb); 
		System.out.println(); 
		flag=aaa.larger(bbb); 
		System.out.println("aaa>bbb 嗎? "+flag);
	}
	public static void show(CRational obj) // 顯示分數
	{ 
	System.out.print(obj.n+"/"+obj.d); 
	}
}
