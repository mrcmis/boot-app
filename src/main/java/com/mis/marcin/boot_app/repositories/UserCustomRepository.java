package com.mis.marcin.boot_app.repositories;

import com.mis.marcin.boot_app.models.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


public interface UserCustomRepository {
    User findByUsername(String username);
}
