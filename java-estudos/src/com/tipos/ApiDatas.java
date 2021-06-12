package com.tipos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ApiDatas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2021, Month.AUGUST, 25);
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());
		
		System.out.println(olimpiadasRio.plusYears(4));
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(olimpiadasRio.plusYears(4).format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		agora.toLocalDate();
	}

}
