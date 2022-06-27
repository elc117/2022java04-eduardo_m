public class Obra {
	
	protected String nome, autor;
	
	public Obra(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	/* Estender para Pintura, Escultura, Livro etc. */
}
