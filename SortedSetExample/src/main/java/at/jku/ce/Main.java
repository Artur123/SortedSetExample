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
		objectSet.add(new DomainObject("Helga", "Kommentar"));
		objectSet.add(new DomainObject("Walter", "Kommentar"));
		objectSet.add(new DomainObject("Hans", "Kommentar"));
		objectSet.add(new DomainObject("Paula", "Kommentar"));
		objectSet.add(new DomainObject("Claudia", "Kommentar"));
		
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
		}
	}

}
