package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o Curso java Poo");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();

		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descri��o Curso js ");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descri��o mentoria java");
		mentoria.setDate(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
