package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.model.User;
import pl.patryk.bank.dao.UserDAO;
import pl.patryk.bank.service.IUserService;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    private UserDAO userDAO;

    public UserService() {
    }

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void saveUser(User user) {
        this.userDAO.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userDAO.findById(id);
    }

    @Override
    public void delete(User user) {
        this.userDAO.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        this.userDAO.deleteById(id);
    }
}
