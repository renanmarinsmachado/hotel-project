package br.com.logatti.project.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.logatti.project.hotel.entity.Period;

public interface PeriodRepository extends CrudRepository<Period, Long>{

	@Query("FROM Period p JOIN FETCH p.room")
	List<Period> findAllFetch();
	
	List<Period> findByPaymentStatus(Boolean paymentStatus);
}
