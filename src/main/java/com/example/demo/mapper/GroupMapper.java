package com.example.demo.mapper;

import com.example.demo.dto.GroupDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface GroupMapper {
    GroupDto getGroup(int id);
    List<GroupDto> getGroupList();

}