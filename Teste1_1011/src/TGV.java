
public class TGV extends Comboio {
	
	
	public TGV(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		type = "TGV";
		service = new ServicoPrioritario();
	}
	
}
