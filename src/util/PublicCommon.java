package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PublicCommon {

	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("step10_group");
	}

	public static EntityManager getEntityManger() {
		return emf.createEntityManager();
	}

	public static void close(EntityManager em) {
		emf.close();
	}
}
