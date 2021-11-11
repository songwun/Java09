package java09;

class Cmath {
	public static void power(int x, int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++)
			sum *= x; // 乘法
		System.out.println(x + "的" + n + "次方=" + sum);
	}
}

public class Class07 {
	public static void main(String[] args) {
		Cmath.power(2, 5); // 2 的 5 次方
		Cmath.power(3, 2); // 3 的 2 次方
	}
}
