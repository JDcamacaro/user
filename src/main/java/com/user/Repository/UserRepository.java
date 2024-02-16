package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Entity.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
