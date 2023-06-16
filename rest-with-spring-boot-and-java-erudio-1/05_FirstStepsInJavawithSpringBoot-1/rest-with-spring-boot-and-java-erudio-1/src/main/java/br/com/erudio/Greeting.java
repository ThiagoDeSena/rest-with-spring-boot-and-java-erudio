package br.com.erudio;

public class Greeting {

	private final long id;
	private final String contet;
	
	public Greeting(long id, String contet) {
		this.id = id;
		this.contet = contet;
	}
	public long getId() {
		return id;
	}
	public String getContet() {
		return contet;
	}

}
