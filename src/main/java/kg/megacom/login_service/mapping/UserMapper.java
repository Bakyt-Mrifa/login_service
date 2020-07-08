package kg.megacom.login_service.mapping;

import kg.megacom.login_service.models.dto.UserDto;
import kg.megacom.login_service.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);
    void updateUserFromDto(UserDto usersDto, @MappingTarget User user);

    List<User> usersDtoToUsers(List<UserDto> userDtos);
    List<UserDto> usersToUsersDto (List<User> user);
}
