package animais;

public class Peixe extends animal{
	
	private String CorDaEscama;
	
	
	
	public void soltarBolha() {
		System.out.println("Soltando bolha, blub");
	}
	

	@Override
	public void locomover() {
		System.out.println("Nadando.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo comida de peixe.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Barulho de peixe");
		// TODO Auto-generated method stub
		
	}


	public String getCorDaEscama() {
		return CorDaEscama;
	}


	public void setCorDaEscama(String corDaEscama) {
		CorDaEscama = corDaEscama;
	}
	
	
	

}
