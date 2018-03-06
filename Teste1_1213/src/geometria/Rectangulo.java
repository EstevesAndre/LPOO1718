package geometria;

public class Rectangulo extends Figura {

	private int x1,y1,x2,y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.abs((y2-y1)*(x2-x1));
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return Math.abs((x2-x1)*2) + Math.abs((y2-y1)* 2);
	}
	

}
