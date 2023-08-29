package in.mvc.bindings;

public class Author {
	private String authorName;
	private String authorEmail;
	private Long authorPhno;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public Long getAuthorPhno() {
		return authorPhno;
	}
	public void setAuthorPhno(Long authorPhno) {
		this.authorPhno = authorPhno;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorEmail=" + authorEmail + ", authorPhno=" + authorPhno + "]";
	}
	

}
