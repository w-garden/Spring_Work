package net.daum.vo;

//자바 저장빈 클래스
public class MemberVO { 
	/* mybatis를 사용하기 위해서 되도록이면 테이블 컬럼명과 빈클래스 변수명을 같게 준다. */

	private String userid;
	private String userpw;
	private String username;
	private String email;
	private String regdate;
	private String updatedate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}	
}
