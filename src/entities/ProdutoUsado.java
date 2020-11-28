package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double valorUnitario, Date dataFabricacao) {
		super(nome, valorUnitario);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String imprimirEtiqueta() {
		
		return getNome() 
				+ "(Usado)" 
				+ String.format("%.2f", getValorUnitario()) 
				+ " - Data Fabricacao: "
				+ sdf.format(dataFabricacao);
	}

}
