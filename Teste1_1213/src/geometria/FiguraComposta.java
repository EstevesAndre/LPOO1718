package geometria;

public class FiguraComposta extends Figura implements Countable{

	private Figura [] figuras;
	
	public FiguraComposta(Figura[] fig) {
		// TODO Auto-generated constructor stub
		figuras = fig;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double val = 0;
		for(Figura x : figuras)
			val += x.getArea();
		return val;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double val = 0;
		for(Figura x:figuras)
			val += x.getPerimetro();
		return val;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return figuras.length;
	}


}
