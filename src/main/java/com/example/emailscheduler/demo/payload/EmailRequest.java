package com.example.emailscheduler.demo.payload;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmailRequest { 
	@Email //https://stackoverflow.com/questions/13649015/error-in-java-import-statement-the-import-javax-validation-constraints-notnull
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String subject;
	
	@NotEmpty
	private String body;
	
	@NotEmpty
	private LocalDateTime dateTime;
	
	@NotNull
	private ZoneId timeZone;

	
	//getters setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public ZoneId getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(ZoneId timeZone) {
		this.timeZone = timeZone;
	}
	
	
}
