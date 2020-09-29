package edu.eci.ieti.taskplanner.taskplanner.services;

import edu.eci.ieti.taskplanner.taskplanner.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    Optional<User> getById(String id);

    User updateUser(User user);

    void createUser(User user);

    void remove(String id);
}
