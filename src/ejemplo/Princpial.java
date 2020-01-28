package ejemplo;


public class Princpial {

	// Presentando al polimorfismo
	public void saludando(Papito hb) {
		hb.saluda();
		// esto da fallo porque no existe en Papito
		// hb.horneaTartas();
	}

	public static void main(String[] args) {
		HijoBueno hijoB = new HijoBueno(9);
		hijoB.saluda();
		HijoRegulero hijoR = new HijoRegulero(8);
		hijoR.saluda();
		NietoBueno nietoB = new NietoBueno(7);
		nietoB.saluda();
		nietoB.horneaTartas();
		// A ver que os parece
//		Papito miPapito = new Papito(9)
//		// DEfino la forma de mi clase pero es anonima
//		// Aunque hereda de Papito
//		{
//
//			@Override
//			public void saluda() {
//				System.out.println("no se quien soy");
//			}
//
//		};
		
		// Crear una clase anonima
		Papito miPapito=new Papito(8) {
			@Override
			public void saluda() {
				System.out.println("he sido creado anonimamente");
			}
		};
		miPapito.saluda();
		miPapito.getCosa();
		Princpial piPrincpial = new Princpial();
		piPrincpial.saludando(hijoB);
		piPrincpial.saludando(hijoR);
		piPrincpial.saludando(nietoB);
	}

}
