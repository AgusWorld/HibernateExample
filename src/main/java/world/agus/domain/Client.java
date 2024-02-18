package world.agus.domain;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="clientes")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="id")
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email	")
	private String email;
	
	public Client() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
	}


	
}
