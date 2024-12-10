package co.edu.ue.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {

	    @Id
	    private String role;

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
	    
	    
	}
	
