package java09;

class Cmath {
	public static void power(int x, int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++)
			sum *= x; // ���k
		System.out.println(x + "��" + n + "����=" + sum);
	}
}

public class Class07 {
	public static void main(String[] args) {
		Cmath.power(2, 5); // 2 �� 5 ����
		Cmath.power(3, 2); // 3 �� 2 ����
	}
}
