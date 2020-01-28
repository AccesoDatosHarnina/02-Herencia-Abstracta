package ejemplo;


public class NietoBueno extends HijoRegulero {

	public NietoBueno(int cosa) {
		super(cosa);
	}

	@Override
	public void saluda() {
		//Siempre tiene que haber super
		super.saluda();
		System.out.println("soy el nieto");
	}
	@Override
	public void horneaTartas() {
		//Siempre que hay herencia debe haber override
		super.horneaTartas();
		this.saluda();
		System.out.println("algunas no se queman");
	}
}
