package geometria;

public class Circulo extends Figura{

	private Ponto p;
	private int raio;
	
	public Circulo(Ponto p, int r) {
		// TODO Auto-generated constructor stub
		if(r <= 0)
			throw new IllegalArgumentException();
		this.p = p;
		raio = r;
	}
	
	public int getRaio()
	{
		return raio;
	}
	public Ponto getCentro()
	{
		return p;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI *raio;
	}
	
	

}
