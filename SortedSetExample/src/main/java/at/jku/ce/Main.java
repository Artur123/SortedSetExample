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

		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(DomainFactory.createDomainObject("Helga", "Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Hans", "Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Paula", "Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Kommentar"));

		
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
		}
	}

}
