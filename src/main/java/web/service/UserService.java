package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repositories.UesrRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl {
    private final UesrRepository userRepository;

    @Autowired
    public UserService(UesrRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl(UesrRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }

    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
