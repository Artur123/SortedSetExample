package at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;
	
	public String id = UUID.randomUUID().toString();

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

}
