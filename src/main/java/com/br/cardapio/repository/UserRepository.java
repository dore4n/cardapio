package com.br.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.br.cardapio.domain.user.User;



public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
