package model;


import javax.persistence.*;

@Table
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String Username;
	@Column
	private String Password;
	@Column
	private String Fullname;
	@Column
	private Integer role;
	public Account() {
	
	}
	public Account(Integer id, String username, String password, String fullname, Integer role) {
		this.id = id;
		Username = username;
		Password = password;
		Fullname = fullname;
		this.role = role;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}

}
