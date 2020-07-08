package kg.megacom.login_service.controllers;

import kg.megacom.login_service.models.dto.UserDto;
import kg.megacom.login_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "save")
    public UserDto save(@RequestHeader("auth") String auth, @RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping(value = "update")
    public UserDto update(@RequestHeader("auth") String auth, @RequestBody UserDto userDto, Long id){
        return  userService.updateUser(userDto,id);
    }

    @PutMapping(value = "delete")
    public boolean delete(@RequestHeader("auth") String auth, @RequestParam Long id){
        return userService.deleteUser(id);
    }

    @GetMapping("find")
    public UserDto getUserById(@RequestHeader("auth") String auth, @RequestParam Long id){
        return  userService.findBiId(id);
    }

    @GetMapping("all")
    public List<UserDto> findAllUsers (@RequestHeader("auth") String auth){
        return userService.findAllUsers();
    }

}
