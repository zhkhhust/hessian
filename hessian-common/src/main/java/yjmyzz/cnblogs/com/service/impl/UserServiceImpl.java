package yjmyzz.cnblogs.com.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yjmyzz.cnblogs.com.po.User;
import yjmyzz.cnblogs.com.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User getUser(String passport) {
		User u = new User();
		u.setPassport(passport);
		u.setCreateDate(new Date());
		return u;
	}

	@Override
	public List<User> getUserList(){
		List<User> retList = new ArrayList<User>();
		User zkh = new User();
		zkh.setPassport("zkh");
		zkh.setCreateDate(new Date());
		
		User zhangyuan = new User();
		zhangyuan.setPassport("zhangyuan");
		zhangyuan.setCreateDate(new Date());
		
		retList.add(zkh);
		retList.add(zhangyuan);
		return retList;
	}
}
