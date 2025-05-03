package vn.duynv.jpatoseniorjava.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class UserResponse {
    private final Long id;
    private final String username;
    private final String email;

    private Set<RoleDTO> roles = new HashSet<>();
    private AddressDTO address;
}
