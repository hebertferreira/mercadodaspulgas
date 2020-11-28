package entities;

public class Produto {
	
	private String nome;
	private Double valorUnitario;
	
	public Produto() {
		
	}

	public Produto(String nome, Double valorUnitario) {
		this.nome = nome;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public String imprimirEtiqueta() {
		
		return nome + " - R$" + String.format("%.2f", valorUnitario);
	}
}
