package vn.duynv.jpatoseniorjava.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
    private String street;
    private String country;
    private String city;
}
