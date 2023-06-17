package com.hackerrank.stocktrades.controller;

import java.util.Date;

public class ErrorMessage
{
	int value;
	Date date;
	String message;
	String description;

	public ErrorMessage(int value, Date date, String message, String description)
	{
		this.value = value;
		this.date = date;
		this.message = message;
		this.description = description;
	}

	public ErrorMessage(int value)
	{
		this.value = value;
	}

}
