package com.abc.dto;

	
	public class RegisterDto {
		
		private String firstname;
		private String lastname;
		private String email;
		private String dateofbirth;
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		@Override
		public String toString() {
			return "RegisterDto [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
					+ ", dateofbirth=" + dateofbirth + "]";
		}
		
		
		
		
}