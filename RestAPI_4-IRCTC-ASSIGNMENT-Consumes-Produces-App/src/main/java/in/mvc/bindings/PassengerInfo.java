package in.mvc.bindings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassengerInfo {

	private String name;
	private Long phno;
	private String jdate;
	private String form;
	private String to;
	private Integer trainNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "PassengerInfo [name=" + name + ", phno=" + phno + ", jdate=" + jdate + ", form=" + form + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}
	
}
