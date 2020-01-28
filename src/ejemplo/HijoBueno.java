package ejemplo;


public class HijoBueno extends Papito {

	public HijoBueno(int cosa) {
		super(cosa);
	}

	@Override
	public void saluda() {
		System.out.println("Soy el hijo bueno");
	}
}
	//tiene que ser igual
//	@Override
//	public void saluda(int otro) {
//		System.out.println("Soy el hijo bueno");
//	}
	
