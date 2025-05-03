package vn.duynv.jpatoseniorjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.duynv.jpatoseniorjava.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
