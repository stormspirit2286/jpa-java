package vn.duynv.jpatoseniorjava.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationRequest {
    private String username;
    private String email;
    private String password;

    private AddressRequest addressRequest;
}
