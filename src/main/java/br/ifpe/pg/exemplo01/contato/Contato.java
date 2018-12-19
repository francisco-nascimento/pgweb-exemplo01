package br.ifpe.pg.exemplo01.contato;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Contato {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@NotBlank @Length(min=5, max=40, 
			message= "Tamanho do nome: entre {min} e {max}")
	private String nome;
	@NotBlank @Length(min=8, max=14, 
			message= "Tamanho do telefone: entre {min} e {max}")
	private String telefone;
	@NotNull @Length(min=5, max=40, 
			message= "Tamanho do email: entre {min} e {max}")
	private String email;
	
	
	public Contato() {
		super();
	}
	public Contato(Integer id, String nome, String telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
