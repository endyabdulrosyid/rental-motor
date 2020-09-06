package web.rentalmotor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import web.rentalmotor.entities.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByEmail(String email);

}