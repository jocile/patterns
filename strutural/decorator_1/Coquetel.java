package decorator_1;

import java.util.ArrayList;

public abstract class Coquetel {
	String nome;
	double preco;
	public ArrayList <Coquetel> lista= new ArrayList<Coquetel>();

	public Coquetel(){
		lista.add(this);
	}
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}
