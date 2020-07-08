package kg.megacom.login_service.services.impl;

import kg.megacom.login_service.mapping.UserMapper;
import kg.megacom.login_service.models.dto.UserDto;
import kg.megacom.login_service.models.entity.User;
import kg.megacom.login_service.repository.UserRepository;
import kg.megacom.login_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        // Method to save user.
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user=userRepository.save(user);
        System.out.println("This data from UserService after save: "+user);
        userDto=UserMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto, Long id) {
        // Method to update user ???????????????????????????????
        Long userId=userDto.getId();
        User user=userRepository.findById(userId).orElse(new User());
        user=UserMapper.INSTANCE.userDtoToUser(userDto);
        user=userRepository.save(user);
        userDto=UserMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }

    @Override
    public boolean deleteUser(Long id) {
        User user=userRepository.findById(id).orElse(new User());
        user.setActive(false);
        userRepository.save(user);
        return false;
    }

    @Override
    public UserDto findBiId(Long id) {
        // Method to find User by Id
        User user=userRepository.findById(id).orElse(new User());
        UserDto userDto=UserMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }

    @Override
    public List<UserDto> findAllUsers() {
        // Method to get all Users from entity
        return UserMapper.INSTANCE.usersToUsersDto(userRepository.findAll());
    }


}
