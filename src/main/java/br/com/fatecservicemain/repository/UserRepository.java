package br.com.fatecservicemain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.fatecservicemain.domain.User;


public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {

}
