package observable;

import java.util.Observable;

public class PessoaObservable extends Observable implements Runnable {

	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		this.setChanged();
		this.notifyObservers(nome);
	}

	@Override
	public void run() {

		this.setNome("teste nome");
		this.setNome("teste nome1");
		this.setNome("teste nome2");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setNome("teste nome3");
		this.setNome("teste nome4");
		this.setNome("teste nome5");
		
	}
	
	
	
	
}
