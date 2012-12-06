package at.jku.ce;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(new DomainObject("Helga"));
		objectSet.add(new DomainObject("Walter"));
		objectSet.add(new DomainObject("Hans"));
		objectSet.add(new DomainObject("Paula"));
		objectSet.add(new DomainObject("Claudia"));
		
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.id);
		}
	}

}
