package com.example.demo.mapper;

import com.example.demo.dto.GroupDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface GroupMapper {
    GroupDto getGroupInfo(@Param("groupId") int id);
    List<GroupDto> getGroupList();

}