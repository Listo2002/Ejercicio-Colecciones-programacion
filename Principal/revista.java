package Principal;

public class revista extends Biblioteca 
{
	private int Numero;

	public revista(int codigo, String titulo, int apublicacion, int npaginas, int numero) {
		super(codigo, titulo, apublicacion, npaginas);
		Numero = numero;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	public String toString() {
		return "revista [Numero=" + Numero + "]";
	}
}
