package malladmin.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MallAdminDto {

	   private Long adminId;
	   private String username;
	    private String password;
	    private String email;
	    private String phoneNumber;
	    private LocalDateTime lastLoginTime;
		public MallAdminDto(Long adminId2, String string, String string2, String string3, LocalDateTime localDateTime) {
			// TODO Auto-generated constructor stub
		}
		public Long getAdminId() {
			return adminId;
		}
		public void setAdminId(Long adminId) {
			this.adminId = adminId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
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
		public LocalDateTime getLastLoginTime() {
			return lastLoginTime;
		}
		public void setLastLoginTime(LocalDateTime lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
