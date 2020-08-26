package pl.patryk.bank.service;

import pl.patryk.bank.model.User;

import java.util.Optional;

public interface IUserService {
    void saveUser(User user);
    Optional<User> findById(Long id);
    void delete(User user);
    void deleteById(Long id);
}
