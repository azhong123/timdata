package com.web.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime time1 = LocalTime.now().withNano(0);
		System.out.println(time1);
	}
	
}
