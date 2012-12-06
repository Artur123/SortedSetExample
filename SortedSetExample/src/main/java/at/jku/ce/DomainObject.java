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

	public DomainObject(String uuid) {
		super();
		this.uuid = uuid;
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

}
