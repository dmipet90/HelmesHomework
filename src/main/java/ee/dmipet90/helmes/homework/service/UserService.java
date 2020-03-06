package ee.dmipet90.helmes.homework.service;

import ee.dmipet90.helmes.homework.entity.User;

public interface UserService {
	public User getUserById(long id);
	public void saveUser(User user);
}
