package com.example.tommy_roz.mapper;

import com.example.tommy_roz.dto.UserDto;
import com.example.tommy_roz.dto.UserRegistrationDto;
import com.example.tommy_roz.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
    User fromDto(UserDto userDto);
    List<UserDto> toDto(List<User> users);

    User fromUserRegistrationDto(UserRegistrationDto userCreateDto);
}
