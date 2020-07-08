package kg.megacom.login_service.services;

import kg.megacom.login_service.models.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto, Long id);
    boolean deleteUser(Long id);
    UserDto findBiId(Long id);
    List<UserDto> findAllUsers();
}
