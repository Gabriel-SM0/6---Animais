package animais;

public class Reptil extends animal {
	
	private String CorDaEscama;
	

	@Override
	public void locomover() {
		System.out.println("Andando igual réptil");
		// TODO Auto-generated method stub
		
	}

	public Reptil(String corDaEscama) {
		CorDaEscama = corDaEscama;
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo igual Réptil");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Fazendo barulho de réptil");
		// TODO Auto-generated method stub
		
	}

	public String getCorDaEscama() {
		return CorDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		CorDaEscama = corDaEscama;
	}
	
	
	
	

}
