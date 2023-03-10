
package Utilities;

import Entities.ChucVu;
import Entities.CuaHang;
import Entities.DongSP;
import Entities.KhachHang;
import Entities.MauSac;
import Entities.NhanVien;
import Entities.Product;
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
		properties.put(Environment.PASS, "1");
		properties.put(Environment.SHOW_SQL, "true");
		// tự động tạo DB
//         properties.put(Environment.HBM2DDL_AUTO, "create"); //chỉ dùng khi code first

		conf.setProperties(properties);

		// Khai báo Class được ánh xạ
		// Đánh dấu các class sẽ được thêm vào hibernate
                conf.addAnnotatedClass(Product.class);
                conf.addAnnotatedClass(MauSac.class);
                conf.addAnnotatedClass(ChucVu.class);
                conf.addAnnotatedClass(CuaHang.class);
                conf.addAnnotatedClass(NhanVien.class);
                conf.addAnnotatedClass(KhachHang.class);
                conf.addAnnotatedClass(DongSP.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		FACTORY = conf.buildSessionFactory(registry);

	}

	public static SessionFactory getFactory() {
		return FACTORY;
	}
    
}
