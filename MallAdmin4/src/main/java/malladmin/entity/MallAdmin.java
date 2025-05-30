package malladmin.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="malladmin")
public class MallAdmin {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long adminId;
	    
	    @Column(name="user_name")
	    private String username;
	    
	    @Column(name="password")
	    private String password;
	    
	    @Column(name="email" ,nullable=false, unique=true)
	    private String email;
	    
	    @Column(name="phone_Number")
	    private String phoneNumber;
	    
	    @Column(name="lastLoginTime")
	    private LocalDateTime lastLoginTime;

		public MallAdmin(Long adminId2, String username2, String string, String string2, String string3, LocalDateTime localDateTime) {
			// TODO Auto-generated constructor stub
		}

		public Long getAdminId() {
			return adminId;
		}

		public void setAdminId(Long adminId) {
			this.adminId = adminId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public LocalDateTime getLastLoginTime() {
			return lastLoginTime;
		}

		public void setLastLoginTime(LocalDateTime lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}
	    
	    
	    
}
