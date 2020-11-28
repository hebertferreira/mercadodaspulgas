package entities;

public class ProdutoImportado extends Produto {
	
	private Double valorTaxa;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double valorUnitario, Double valorTaxa) {
		super(nome, valorUnitario);
		this.valorTaxa = valorTaxa;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(Double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
	public Double valorTaxado() {
		return getValorUnitario() + (getValorUnitario() * valorTaxa /100);
	}

	@Override
	public String imprimirEtiqueta() {

		return getNome()
				+ String.format("R$ %.2f", valorTaxado())
				+" - Adicional de Taxa: "
				+ getValorTaxa();
	}
	
	

}
