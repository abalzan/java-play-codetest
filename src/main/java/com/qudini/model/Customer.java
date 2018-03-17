package com.qudini.model;

import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Long id;
	private String name;
	private DateTime duetime;
	private DateTime jointime;

}
