package comum;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [CNPJ=" + CNPJ + "]";
	}

	private static final long serialVersionUID = -7278597293483137780L;
}