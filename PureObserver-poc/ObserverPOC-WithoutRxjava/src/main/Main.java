package main;

import oberserver.PessoaObserver;
import observable.PessoaObservable;

public class Main {

	public static void main(String[] args) {

		PessoaObserver  pessoaObserver = new PessoaObserver();
		
		PessoaObservable  observable = new PessoaObservable();
		
		
		observable.addObserver(pessoaObserver);
		observable.run();
		
	}

}
