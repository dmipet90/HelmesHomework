package ee.dmipet90.helmes.homework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ee.dmipet90.helmes.homework.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
