package edu.eci.ieti.taskplanner.taskplanner.services.serviceImpl;

import edu.eci.ieti.taskplanner.taskplanner.models.User;
import edu.eci.ieti.taskplanner.taskplanner.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public Optional<User> getById(String id) {
        Optional<User> user;
        user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        return user;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public void remove(String id) {
        this.users = users.stream()
                .filter(user -> user.getId().equals(id))
                .collect(Collectors.toList());
    }
}
