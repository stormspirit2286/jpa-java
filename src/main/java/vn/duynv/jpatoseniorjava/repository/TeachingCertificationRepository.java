package vn.duynv.jpatoseniorjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.duynv.jpatoseniorjava.entity.TeachingCertificate;

@Repository
public interface TeachingCertificationRepository extends JpaRepository<TeachingCertificate, Long> {
}
