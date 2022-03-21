package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
	
	private String nome;
	private String descricao;
	private final LocalDate datainicial = LocalDate.now();
	private final LocalDate dataFinal = datainicial.plusDays(45);
	private Set<Dev> devsIncritos = new  HashSet<>();// HashSet ordem não é importate.
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();// LinkedHashSet ordenado ou por ordem especifica.
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsIncritos() {
		return devsIncritos;
	}
	public void setDevsIncritos(Set<Dev> devsIncritos) {
		this.devsIncritos = devsIncritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDatainicial() {
		return datainicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, datainicial, descricao, devsIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(datainicial, other.datainicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsIncritos, other.devsIncritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
