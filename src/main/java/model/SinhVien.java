package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class SinhVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String masv;
	@Column
	private String name;
	@Column
	private Boolean gender;
	@Column
	private Date dateofbirth;
	@Column
	private BigDecimal price;
	@Column
	private String description;
	@Column
	private String createdUser;
	@Column
	private Date createdDate;
	@Column
	private String lastModifiedUser;
	@Column
	private Date lastModifiedDate;
	@Column
	private Boolean status;
	@Column
	private String majoring;
	public SinhVien() {
		super();
	}
	public SinhVien(Integer id, String masv, String name, Boolean gender, Date dateofbirth, BigDecimal price,
			String description, String createdUser, Date createdDate, String lastModifiedUser, Date lastModifiedDate,
			Boolean status, String majoring) {
		super();
		this.id = id;
		this.masv = masv;
		this.name = name;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.price = price;
		this.description = description;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
		this.lastModifiedUser = lastModifiedUser;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
		this.majoring = majoring;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastModifiedUser() {
		return lastModifiedUser;
	}
	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMajoring() {
		return majoring;
	}
	public void setMajoring(String majoring) {
		this.majoring = majoring;
	}
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", masv=" + masv + ", name=" + name + ", gender=" + gender + ", dateofbirth="
				+ dateofbirth + ", price=" + price + ", description=" + description + ", createdUser=" + createdUser
				+ ", createdDate=" + createdDate + ", lastModifiedUser=" + lastModifiedUser + ", lastModifiedDate="
				+ lastModifiedDate + ", status=" + status + ", majoring=" + majoring + "]";
	}
	
	
}
