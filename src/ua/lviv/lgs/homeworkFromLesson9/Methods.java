package ua.lviv.lgs.homeworkFromLesson9;




public class Methods {

	protected double a, b;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Methods [a=" + a + ", b=" + b + "]";
	}

	double sum(double a, double b) throws Throwable {
		checkforexeprion(a, b);
		System.out.println("Sum = " + (a + b));
		return a + b;
	}

	double sub(double a, double b) throws Throwable {
		checkforexeprion(a, b);
		System.out.println("Sub = " + (a - b));
		return a - b;
	}

	double mult(double a, double b) throws Throwable {
		checkforexeprion(a, b);
		System.out.println("Mult = " + a * b);
		return a * b;
	}

	double div(double a, double b) throws Throwable {
		checkforexeprion(a, b);
		System.out.println("Div = " + Math.round(a / b));
		System.out.printf("Div = " + "%.2f" + "\n", a / b);
		return a / b;
	}

	public static void main(String[] args) throws Throwable {
		
	}
 
	

	void checkforexeprion(double a, double b) throws Throwable {
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException();
		} else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
			throw new ArithmeticException();
		} else if (a == 0 && b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 && b > 0) {
			String message = "\nEntered numbers are bigger than zero";
			throw new MyExeption(message);
		}

	}

}
