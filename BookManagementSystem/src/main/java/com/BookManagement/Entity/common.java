package com.BookManagement.Entity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.context.annotation.Bean;

public class common {
	@Bean
	public String getDate()
	{
		Date today = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(today);
	}


	@Bean
	public String getTime() {
		return LocalDate.now().toString();
	}
}

