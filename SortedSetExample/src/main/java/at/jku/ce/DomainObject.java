package at.jku.ce;

import java.util.UUID;

public class DomainObject {


	private String name;
	private String uuid = UUID.randomUUID().toString();
	private String comment;

	/**
	* Default constructor
	*/

	protected DomainObject() {
		super();
	}

	protected DomainObject(String name, String comment) {
		super();
		this.name = name;
	}

	public String getUuId() {
		return uuid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(final String pname) {
		this.name = pname;
	}
	
	@Override
	public String toString() {
		 return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; 
	}
}
