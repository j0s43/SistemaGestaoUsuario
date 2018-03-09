package model;

public class Usuario {
	//Atributo
	private String nome;
	private String sobrenome;
	private String CPF;
	private String DataDeNascimento;
	private String email;
	private String sexo;
	
	//Metodo Construtor
	public Usuario(String nome, String sobrenome, String cPF, String dataDeNascimento, String email, String sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
		DataDeNascimento = dataDeNascimento;
		this.email = email;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataDeNascimento() {
		return DataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
