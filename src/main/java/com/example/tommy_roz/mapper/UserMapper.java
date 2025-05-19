package com.example.tommy_roz.mapper;

import com.example.tommy_roz.dto.UserDto;
import com.example.tommy_roz.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    public UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public UserDto toDto(User user);
    public User fromDto(UserDto userDto);
}
