package ejemplo;


public abstract class Papito {
	public int cosa;

	public Papito(int cosa) {
		super();
		this.cosa = cosa;
	}

	/*
	 * Los metodos abstractos no se implementan en la clase abstracta pero si se
	 * definen en ella y TODA clase que herede de esta esta obligada a implementar el metodo
	 * o a pasar la pelota si tambien es abstracta
	 */
	abstract public void saluda();

	public int getCosa() {
		return cosa;
	}

	public void setCosa(int cosa) {
		this.cosa = cosa;
	}

}
