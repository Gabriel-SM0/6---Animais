package animais;

public class Ave extends animal{
	
	private String CorPena;
	
	public void fazerNinho() {
		System.out.println("Fazendo o ninho");
	}
	
	
	

	@Override
	public void locomover() {
		System.out.println("Voando.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo comida de passarinho.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		System.out.println("pru");
		// TODO Auto-generated method stub
		
	}




	public String getCorPena() {
		return CorPena;
	}




	public void setCorPena(String corPena) {
		CorPena = corPena;
	}
	
	

}
