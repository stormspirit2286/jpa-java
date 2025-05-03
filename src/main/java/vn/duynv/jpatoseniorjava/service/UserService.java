package vn.duynv.jpatoseniorjava.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.duynv.jpatoseniorjava.dto.request.UserCreationRequest;
import vn.duynv.jpatoseniorjava.dto.response.UserResponse;
import vn.duynv.jpatoseniorjava.entity.Address;
import vn.duynv.jpatoseniorjava.entity.User;
import vn.duynv.jpatoseniorjava.exception.ResourceNotFoundException;
import vn.duynv.jpatoseniorjava.mapper.UserMapper;
import vn.duynv.jpatoseniorjava.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Transactional
    public UserResponse saveUser(UserCreationRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        if (request.getAddressRequest() != null) {
            Address address = new Address();
            address.setCity(request.getAddressRequest().getCity());
            address.setStreet(request.getAddressRequest().getStreet());
            address.setCountry(request.getAddressRequest().getCountry());
            address.setUser(user);
            user.setAddress(address);
        }

        return userMapper.toDTO(userRepository.save(user));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("Cannot find user with email: " + email));
    }
}
