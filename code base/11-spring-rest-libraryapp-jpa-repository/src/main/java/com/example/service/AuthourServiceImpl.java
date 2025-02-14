package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.exception.AuthourNotFoundException;
import com.example.repo.AuthourRepository;

import jakarta.transaction.Transactional;
//@Component
@Service
public class AuthourServiceImpl  implements AuthourService{
	@Autowired
	private AuthourRepository authRepo;
	@Override
	@Transactional
	public Authour addAuthourService(Authour a) {
		return authRepo.save(a);
	}
	public List<Authour> allAuthoursService() {
		return authRepo.findAll();
	}
	public Authour searchByIdService(int id) {
		Optional<Authour> optional=  authRepo.findById(id);
		if(optional.isPresent())
			return optional.get();
		throw new AuthourNotFoundException("The authour "+id+" Not Found");
	}

	@Override
	public List<Authour> searchByAuthourNameService(String name) {
		return authRepo.findByName(name);
	}

	@Override
	public List<Book> findByAuthourService(int authourId) {
		return authRepo.searchBooks(authourId);
	}

}
