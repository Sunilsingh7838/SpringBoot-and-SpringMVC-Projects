package in.mvc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketInfo {
	private Integer ticketId;
	private String pnr;
	private String ticketStatus;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "TicketInfo [ticketId=" + ticketId + ", pnr=" + pnr + ", ticketStatus=" + ticketStatus + "]";
	}
	

}
