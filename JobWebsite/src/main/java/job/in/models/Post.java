package job.in.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")

public class Post {
	private String Role;
	private int exp;
	private String Desc;
	private String Skills[];
	public String getRole() {
		return Role;
	}
	public void setRole(String Role) {
		this.Role = Role;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String[] getSkills() {
		return Skills;
	}
	public void setSkills(String[] skills) {
		Skills = skills;
	}
	@Override
	public String toString() {
		return "Post [Role=" + Role + 
	", exp=" + exp + 
	", Desc=" + Desc + 
	", Skills=" + Arrays.toString(Skills) + "]";
	}
	
	

}
