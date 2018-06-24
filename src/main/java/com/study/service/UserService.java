package com.study.service;


import com.study.dao.UserDAO;
import com.study.model.User;

public class UserService {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public void detele(User user) {
        userDAO.detele();
    }

}
