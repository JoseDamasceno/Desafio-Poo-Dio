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

		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("Bootcamp java Developer");
		bootCamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootCamp.getConteudos().add(curso1);
		bootCamp.getConteudos().add(curso2);
		bootCamp.getConteudos().add(mentoria);
		
		Dev devJose = new Dev();
		devJose.setNome("Jos� Damasceno");
		devJose.inscreverBootCamp(bootCamp);
		System.out.println("Conteurdos Inscritos de " + devJose.getNome() + devJose.getConteudosInscritos() );
		devJose.progredir();
		devJose.progredir();
		devJose.progredir();
		System.out.println("=");
		System.out.println("Conteurdos Concluidos de " + devJose.getNome() + devJose.getConteudosConcluidos());
		System.out.println("XPs:" + devJose.calcularTodalXp());
		
		
		System.out.println("=======");

		Dev devLais = new Dev();
		devLais.setNome("Lais de Paula");
		devLais.inscreverBootCamp(bootCamp);
		System.out.println("Conteurdos Inscritos " + devLais.getNome() + devLais.getConteudosInscritos());
		System.out.println("=");
		System.out.println("Conteurdos Concluidos de " + devLais.getNome() + devLais.getConteudosConcluidos());
		devLais.progredir();
		System.out.println("XPs:" + devLais.calcularTodalXp());

		
		
		
	}

}
