package com.example.dto;

import com.example.entity.Authour;
import com.example.entity.Genre;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Dto ==> Data Transfer Object
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
//private int bookId;
	@NotBlank(message = "Plz enter book name")
	@NotNull(message = "Plz enter book name")
private String bookName;
	//@NotBlank(message = "Plz enter Genre")
	@NotNull(message = "Plz enter Genre")
@Enumerated(EnumType.STRING)
private Genre genre;
@Min(value = 1, message = "Minimum cost is Rs 1")
private float cost;
@Min(value = 1,message = "Minimum stock should be 1")
private int stock;
private int authourId;

}
