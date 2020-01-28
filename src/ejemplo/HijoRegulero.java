package ejemplo;

public class HijoRegulero extends Papito {

	public HijoRegulero(int cosa) {
		super(cosa);
	}

	@Override
	public void saluda() {
		System.out.println("no soy tan bueno pero voy mejorando");
	}
	public void horneaTartas() {
		System.out.println("Todas se preparan con canela");
	}
}
