package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.ui.Model;

import javax.persistence.NamedNativeQuery;
import javax.persistence.Query;
import javax.persistence.QueryHint;
import javax.sql.DataSource;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUserByModelAndSeries(String model, int series);
}
