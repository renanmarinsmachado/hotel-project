package br.com.logatti.project.hotel.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.Period;
import br.com.logatti.project.hotel.entity.Room;
import br.com.logatti.project.hotel.repository.PeriodRepository;

@Service
public class PeriodService {

	@Autowired
	private PeriodRepository periodRepository;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private RoomService roomService;
	
	public List<Period> findAll(){
		return periodRepository.findAllFetch();
	}
	
	public List<Period> findByPaymentStatus(Boolean paymentStatus){
		return periodRepository.findByPaymentStatus(paymentStatus);
	}
	
	public void save(Long idClient, Long idRoom){
		
		Period period = new Period();
		
		period.setClient(clientService.findById(idClient));
		period.setRoom(roomService.findById(idRoom));
		period.setPaymentStatus(false);
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-dd-mm");
		period.setEntryDate(dt.format(new Date()));
		
		periodRepository.save(period);
		
		Room room = roomService.findById(idRoom);
		room.setAvailable(false);
		roomService.save(room);
	}
}
