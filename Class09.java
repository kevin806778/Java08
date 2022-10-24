package Java08;
class CCalculator {
	int a;
	int b;
	int c;

	void set_value(int x, int y, int z) {
		x = 25;
		y = 3;
		z = 7;
	}

	void show() {
		System.out.println(a + " " + b + " " + c);
	}

	void add() {
		System.out.println(a + b + c);
	}

	void sub() {
		System.out.println(a - b - c);
	}

	void mul() {
		System.out.println(a * b * c);
	}

	void avg() {
		System.out.println((double)(a + b + c) / 3);
	}
	void showAll()
	   {
		show();
	    add();
	    sub();
	    mul();
	    avg();
	   }
}

public class Class09 {
	public static void main(String args[]) {
		CCalculator obj = new CCalculator();
		obj.a = 25;
		obj.b = 3;
		obj.c = 7;
		obj.showAll();
	}

}
