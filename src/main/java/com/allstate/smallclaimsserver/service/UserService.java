package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.domain.User;
import com.allstate.smallclaimsserver.domain.UserDTO;

import java.util.List;

public interface UserService {


    public void save(User user);

    public User findUser(String username);
    public List<UserDTO> getAllUsers();
}
