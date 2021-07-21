package com.tipos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ApiDatas {

	public static void main(String[] args) throws ParseException {
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

		/*
		 * Date: Armazena o número de milissegunds desde a meia noite do dia 1 de
		 * janeiro de 1970 GMT(UTC) SimpleDateFormat Instant
		 * 
		 */
		Date y3 = Date.from(Instant.parse("2021-06-25T15:42:07Z"));
		System.out.println(y3);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfHMS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdfUTC = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdfUTC.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf.parse("25/06/2018");
		Date y2 = sdfHMS.parse("25/06/2018 15:42:07");
		System.out.println(sdfHMS.format(y1));
		System.out.println(sdfUTC.format(y1));
		System.out.println(y2);

		Date x1 = new Date();
		System.out.println(x1);

		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(x2);

		Date x3 = new Date(0L);
		System.out.println(x3);

		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println(x4);

		Date d = Date.from(Instant.parse("2021-06-25T15:42:07Z"));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println(minutes);
		int month = cal.get(Calendar.MONTH + 1);
		System.out.println(month);
	}
}
