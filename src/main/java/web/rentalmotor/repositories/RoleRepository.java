package web.rentalmotor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import web.rentalmotor.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}