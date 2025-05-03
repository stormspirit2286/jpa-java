package vn.duynv.jpatoseniorjava.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.duynv.jpatoseniorjava.dto.request.UserCreationRequest;
import vn.duynv.jpatoseniorjava.dto.response.UserResponse;
import vn.duynv.jpatoseniorjava.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "localDateTime", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    User toEntity(UserCreationRequest request);

    UserResponse toDTO(User user);

    List<UserResponse> toDTOList(List<User> users);
}
