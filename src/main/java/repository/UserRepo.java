package repository;

import org.springframework.data.repository.CrudRepository;
import model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
