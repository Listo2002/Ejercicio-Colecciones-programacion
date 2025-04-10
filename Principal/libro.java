package Principal;

public class libro extends Biblioteca
{
	private String Autor;

	public libro(int codigo, String titulo, int apublicacion, int npaginas, String autor) {
		super(codigo, titulo, apublicacion, npaginas);
		Autor = autor;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}
	public String toString() {
		return "libro [Autor=" + Autor + "]";
	}
}
