package com.example.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Authour;
import com.example.entity.Book;
public interface AuthourRepository extends JpaRepository<Authour, Integer> {
	//query methods
	//findBy<<FieldName>>
	List<Authour> findByName(String name);
//	@Query(value = "select * from book where authour_id = :id",nativeQuery = true)
	@Query(value = "select b from Book b  where b.authour.authourId = :id")
	List<Book> searchBooks(@Param("id")  int authourId);
}
