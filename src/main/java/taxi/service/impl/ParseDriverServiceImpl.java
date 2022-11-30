package taxi.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.ParseDriverService;

@Service
public class ParseDriverServiceImpl implements ParseDriverService {
    @Override
    public Driver parseDriverFromResultSet(ResultSet resultSet) throws SQLException {
        Long driverId = resultSet.getObject("id", Long.class);
        String name = resultSet.getNString("name");
        String licenseNumber = resultSet.getNString("license_number");
        String login = resultSet.getNString("login");
        String password = resultSet.getNString("password");
        Driver driver = new Driver();
        driver.setId(driverId);
        driver.setName(name);
        driver.setLicenseNumber(licenseNumber);
        driver.setLogin(login);
        driver.setPassword(password);
        return driver;
    }
}
