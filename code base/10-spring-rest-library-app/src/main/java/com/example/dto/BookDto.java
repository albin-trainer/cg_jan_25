package com.example.dto;

import com.example.entity.Genre;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class BookDto {
private int bookId;
private String bookName;
@Enumerated(EnumType.STRING)
private Genre genre;
private float cost;
private int stock;
private int authourId;
public BookDto() {
	
}
}
