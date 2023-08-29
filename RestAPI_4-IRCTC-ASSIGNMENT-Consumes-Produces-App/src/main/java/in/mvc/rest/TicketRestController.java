package in.mvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.bindings.PassengerInfo;
import in.mvc.bindings.TicketInfo;

@RestController
public class TicketRestController {

	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable("ticketId") Integer ticketId){
		//Logic to get ticket data
		
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(ticketId);
		tinfo.setPnr("qwerty");
		tinfo.setTicketStatus("CONFIRMED");

		return new ResponseEntity<>(tinfo, HttpStatus.OK);
	}
	@PostMapping(value = "/ticket" , 
			consumes = {"application/json"}, 
			produces = {"application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		//LOCGIC TO BOOK TICKET
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(123);
		tinfo.setPnr("qwerty");
		tinfo.setTicketStatus("CONFIRMED");

		return new ResponseEntity<>(tinfo, HttpStatus.CREATED);
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		//logic to update ticket
		
		return new ResponseEntity<>("Ticket updated", HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId){
		System.out.println(ticketId);
		//logic to delete ticket
		return new ResponseEntity<>("Ticket Deleted", HttpStatus.OK);
	}
}
