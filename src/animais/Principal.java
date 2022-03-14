package animais;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil re = new Reptil("preto");
		Reptil r[] = new Reptil[1];
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		r[0] = new Reptil("azul");
		
		//r[0].setPeso(20);
		
		//Lutador L[] = new Lutador[6];
		
		r[0].locomover();

		
		m.setPeso(150f);
		m.setCorDoPelo("Azul");
		m.emitirSom();
		m.locomover();
		

	}

}
