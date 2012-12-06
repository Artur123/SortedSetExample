package at.jku.ce;

import java.util.UUID;

public class DomainObject {


	private String name;
	private String uuid = UUID.randomUUID().toString();
	private String comment;

	/**
	* Default constructor
	*/

	public DomainObject() {
		super();
	}

	public DomainObject(String name, String comment) {
		super();
		this.name = name;
	}

	public String getUuId() {
		return uuid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String pname) {
		this.name = pname;
	}
}
