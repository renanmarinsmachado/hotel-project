package br.com.logatti.project.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.logatti.project.hotel.entity.AditionalPeriod;

public interface AditionalPeriodRepository extends CrudRepository<AditionalPeriod, Long>{

	@Query("SELECT a FROM AditionalPeriod a WHERE a.period.id = :idPeriod")
	public List<AditionalPeriod> findByIdPeriod(@Param("idPeriod") Long idPeriod);
}
