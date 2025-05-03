package vn.duynv.jpatoseniorjava.dto.response;

import lombok.Data;

@Data
public class AddressDTO {
    private Long id;
    private String street;
    private String city;
    private String country;
}
