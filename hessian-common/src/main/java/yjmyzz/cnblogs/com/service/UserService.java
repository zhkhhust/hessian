package yjmyzz.cnblogs.com.service;

import java.util.List;

import yjmyzz.cnblogs.com.po.User;

public interface UserService {
    
    public User getUser(String passport);
    
    public List<User> getUserList();
}