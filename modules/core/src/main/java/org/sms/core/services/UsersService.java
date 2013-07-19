package org.sms.core.services;

import org.sms.models.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UsersService {

    User saveUser(User user);

    void deleteUser(User user);

    User findUser(Long id);

    List<User> findAllUsers();

    Page<User> findAllUsers(int page, int size);
}
