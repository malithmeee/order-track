package org.sms.core.services.impl;

import org.sms.core.services.UsersService;
import org.sms.models.User;
import org.sms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@Service("usersService")
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public User findUser(Long id) {
        return userRepository.findOne(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Page<User> findAllUsers(int page, int size) {
        return userRepository.findAll(new PageRequest(page, size));
    }
}