package geometria;

public class Ponto implements Comparable<Ponto> {

	private int x,y;
	public Ponto(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}

	 @Override
	 public boolean equals(Object obj) {
	 if (obj == null || ! (obj instanceof Ponto)) return false;
	 else return this.x == (((Ponto)obj).getX())&& this.y == (((Ponto)obj).getY()) ;
	 } 
	
	 public String toString()
	 {
		 return "(" + x + ", " + y + ")";
	 }
	 
	 public int compareTo(Ponto p)
	 {
		 if(this.equals(p)) return 0;
		 
		 if ( (x < p.getX()) || (x == p.getX() && y < p.getY()) ) return -1;
		 else return 1;
	 }
}
