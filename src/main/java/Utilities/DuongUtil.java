
package Utilities;

import Entities.MauSac;
import Entities.ProductS;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author hrska
 */
public class DuongUtil {
    private static final SessionFactory FACTORY;

	static {
		Configuration conf = new Configuration();

		// Cấu hình kết nối
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
		properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		properties.put(Environment.URL,
				"jdbc:sqlserver://localhost:1433;databaseName=assDAM");
		properties.put(Environment.USER, "sa");
		properties.put(Environment.PASS, "123456");
		properties.put(Environment.SHOW_SQL, "true");
		// tự động tạo DB
//         properties.put(Environment.HBM2DDL_AUTO, "create"); //chỉ dùng khi code first

		conf.setProperties(properties);

		// Khai báo Class được ánh xạ
		// Đánh dấu các class sẽ được thêm vào hibernate
                conf.addAnnotatedClass(ProductS.class);
                conf.addAnnotatedClass(MauSac.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		FACTORY = conf.buildSessionFactory(registry);

	}

	public static SessionFactory getFactory() {
		return FACTORY;
	}
    
}
