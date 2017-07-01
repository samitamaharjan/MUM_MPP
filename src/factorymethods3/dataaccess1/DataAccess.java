package factorymethods3.dataaccess1;

import java.sql.SQLException;

public interface DataAccess {
	void read(Dao dao) throws SQLException;
	void write(Dao dao) throws SQLException;
	
}
