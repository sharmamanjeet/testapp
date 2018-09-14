package com.sample.model;

public class OutputMessage extends Message {

	private String time;

	public OutputMessage(String from, String text, String time) {
		super(from, text);
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
