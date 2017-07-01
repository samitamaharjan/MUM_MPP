package factorymethods3.business1;

import java.sql.SQLException;
import java.util.List;

import factorymethods3.dataaccess1.Dao;
import factorymethods3.dataaccess1.DataAccess;
import factorymethods3.dataaccess1.DataAccessFactory;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Dao dao = new AddressDao();
		DataAccess da = DataAccessFactory.getDataAccess();
		try {
			da.read(dao);
			List<Address> addresses = (List<Address>)dao.getResults();
			//display addresses
		} catch(SQLException e) {
			//handle
		}
		

	}

}
