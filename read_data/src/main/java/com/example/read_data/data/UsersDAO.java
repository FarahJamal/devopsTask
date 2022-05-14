package com.example.read_data.data;


import com.example.read_data.model.Users;

public interface UsersDAO {
    Users add(Users users);

    Users findByUsername(String username,String password);

    boolean update(Users users);

    boolean deleteByRoll(long roll);

    Users loginUser(Users users);
}

