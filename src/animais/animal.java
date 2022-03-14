package animais;

public abstract class animal {
	private float peso;
	private int idade;
	private String membros;
	
	protected abstract void locomover();
	protected abstract void alimentar();
	protected abstract void emitirSom();
	
	
	
	
	public animal() {
	}
	
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMembros() {
		return membros;
	}
	public void setMembros(String membros) {
		this.membros = membros;
	}

	
	
	
	
	
}
