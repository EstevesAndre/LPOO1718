
public class Carruagem {

	private int num;

	public Carruagem(int i) {
		// TODO Auto-generated constructor stub
		num = i;
	}

	public int getNumLugares() {
		// TODO Auto-generated method stub
		return num;
	}

	public boolean equals(Object obj) {
		if (obj == null || ! (obj instanceof Carruagem)) return false;
		else return this.num == (((Carruagem)obj).num);
	} 

}
