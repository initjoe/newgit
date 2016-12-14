import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pankaj.java.dao.EmployeeDao;
import org.pankaj.java.entity.Employee;

public class MainClass {

	public static final Log LOGGER = LogFactory.getLog(MainClass.class);

	private EmployeeDao dao = new EmployeeDao();

	public static void main(String[] args) {
		MainClass m = new MainClass();
		LOGGER.error("error");
		LOGGER.info("Info");

		LOGGER.debug("Debug");
		Employee r = m.dao.getEmployeeFor(100);
		LOGGER.info(r.getFirstName());
		LOGGER.info("pankaj");
		LOGGER.info("raj");
		

	}
}
