package com.example.contactmanager.model;

public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

	public Contact(String name, String email, String phone) {
		this.firstName=name;
		this.email=email;
		this.phone=phone;
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ "]";
	}
    

    // Getters and Setters for all fields (code omitted for brevity, see source for full code)
    // toString method (code omitted for brevity, see source for full code)
}
