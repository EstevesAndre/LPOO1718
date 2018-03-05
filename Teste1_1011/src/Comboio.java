import java.util.ArrayList;

public class Comboio {

	private String name;
	private ArrayList<Carruagem> carr;
	private int numPassageiros;
	protected String type;
	public ServicoABordo service;
	
	public Comboio(String string) {
		// TODO Auto-generated constructor stub
		name = string;
		carr = new ArrayList<>();
		numPassageiros = 0;
		type = "Comboio";
		service = new ServicoRegular();
	}

	public String getNome()
	{
		return name;
	}

	public int getNumLugares() {
		// TODO Auto-generated method stub
		int val = 0;
		for(Carruagem x : carr)
			val += x.getNumLugares();
		return val;
	}

	public int getNumCarruagens() {
		// TODO Auto-generated method stub
		return carr.size();
	}

	public void addCarruagem(Carruagem a1) {
		// TODO Auto-generated method stub
		carr.add(a1);
	}

	public Carruagem getCarruagemByOrder(int i) {
		// TODO Auto-generated method stub
		if(i > carr.size())
			return null;
		else
			return carr.get(i);
	}

	public void removeAllCarruagens(int i) {
		// TODO Auto-generated method stub
		for(int x = 0; x < carr.size(); x++)
		{
			Carruagem aux = this.getCarruagemByOrder(x);
			if(aux.getNumLugares() == i)
			{
				carr.remove(aux);
				x--;
			}
		}
	}

	public int getNumPassageiros() {
		// TODO Auto-generated method stub
		return this.numPassageiros;
	}

	public int getLugaresLivres() {
		// TODO Auto-generated method stub
		return this.getNumLugares() - this.numPassageiros;
	}

	public void addPassageiros(int i) throws PassengerCapacityExceeded{
		// TODO Auto-generated method stub
		if(i > this.getLugaresLivres())
			throw new PassengerCapacityExceeded();

		this.numPassageiros += i;
	}

	public void removePassageiros(int i)  throws PassengerCapacityExceeded{
		// TODO Auto-generated method stub
		if(i > this.getNumPassageiros())
			throw new PassengerCapacityExceeded();
		this.numPassageiros -= i;
	}

	public void removePassageiros() {
		// TODO Auto-generated method stub
		this.numPassageiros = 0;
	}

	public String toString()
	{
		String result = type + " " + this.name + ", " + this.getNumCarruagens();

		if(this.getNumCarruagens() == 1)
			result += " carruagem, ";
		else
			result += " carruagens, ";

		result += this.getNumLugares();

		if(this.getNumLugares() == 1)
			result += " lugar, ";
		else 
			result += " lugares, ";

		result += this.getNumPassageiros();

		if(this.getNumPassageiros() == 1)
			result += " passageiro";
		else 
			result += " passageiros";

		return result;
	}


	public boolean equals(Object obj) {
		if (obj == null || ! (obj instanceof Comboio)) return false;
		else {
			if(carr.size() != ((Comboio)obj).carr.size())
				return false;
			
			else {
				for(int i = 0; i < carr.size(); i++)
				{
					if (!(carr.get(i).equals(((Comboio)obj).carr.get(i))))
						return false;
				}
				return true;
			}
		}
			
	}

	public ServicoABordo getServicoABordo() {
		// TODO Auto-generated method stub
		return service;
	}

	public String getDescricaoServico() {
		// TODO Auto-generated method stub
		return service.getDescricaoServico();
	}

	public void setServicoABordo(ServicoPrioritario servicoPrioritario) {
		// TODO Auto-generated method stub
		service = servicoPrioritario;
	} 
}
