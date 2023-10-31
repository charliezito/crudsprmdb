package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Book {

	
	@Id
	private String bookId;
	
	private String bookname;
	
	private String bookauthername;

	public Book(String bookId, String bookname, String bookauthername) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.bookauthername = bookauthername;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthername() {
		return bookauthername;
	}

	public void setBookauthername(String bookauthername) {
		this.bookauthername = bookauthername;
	}


	
	
	
	
}
