package animais;

public class Mamifero extends animal {
	
	private String corDoPelo;

	@Override
	public void locomover() {
		System.out.println("Andando igual mamífero");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo igual mamifero");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som igual mamífero");
		// TODO Auto-generated method stub
		
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	
	
	

}
