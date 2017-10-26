package uebung_2_1;

public class PQFormel {
	public static void main(String[] args) {
	double p=5;
	double q=1;
	double a=(-1)*p/2;
	double b=(p/2)*(p/2)-q;
	double x1=a+ Math.sqrt(b);
	double x2=a-Math.sqrt(b);
	System.out.println("x1=" +x1);
	System.out.println("x2=" +x2);
	}
}
