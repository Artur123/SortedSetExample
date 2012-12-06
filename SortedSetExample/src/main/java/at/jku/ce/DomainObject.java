package at.jku.ce;

import java.util.UUID;

public class DomainObject {


	private String name;
	private String uuid = UUID.randomUUID().toString();

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

}
