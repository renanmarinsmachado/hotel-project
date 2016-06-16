package br.com.logatti.project.hotel.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.endpoint.json.ItemMenuRoom;
import br.com.logatti.project.hotel.entity.AditionalPeriod;
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
	
	@Autowired
	private MenuService menuService;
		
	@Autowired
	private AditionalPeriodService aditionalPeriodService;
	
	public List<Period> findAll(){
		return periodRepository.findAllFetch();
	}
	
	public List<Period> findByPaymentStatus(Boolean paymentStatus){
		return periodRepository.findByPaymentStatus(paymentStatus);
	}
	
	public Period findById(Long id){
		return periodRepository.findOne(id);
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
	
	public void save(Period period){
		periodRepository.save(period);
	}
	
	public void saveMenuInPeriod(ItemMenuRoom itemMenuRoom){
		AditionalPeriod aditionalPeriod = new AditionalPeriod();
		
		if(itemMenuRoom.getQtdItem() > 0){
			aditionalPeriod.setMenu(menuService.findById(itemMenuRoom.getIdItem()));
			aditionalPeriod.setPeriod(this.findById(itemMenuRoom.getIdPeriod()));
			aditionalPeriod.setQuantity(itemMenuRoom.getQtdItem());
			
			aditionalPeriodService.save(aditionalPeriod);
		}
	}
	
	public List<AditionalPeriod> findItensMenu(Long idPeriod){
		return aditionalPeriodService.findAllPeriod(idPeriod);
	}
	
	public void finishPeriod(Long idPeriod){
		Period period = this.findById(idPeriod);
		period.setPaymentStatus(true);
		this.save(period);
		
		Room room = roomService.findById(period.getRoom().getId());
		room.setAvailable(true);
		roomService.save(room);
	}
}
