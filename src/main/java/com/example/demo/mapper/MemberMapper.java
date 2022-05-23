package com.example.demo.mapper;

import com.example.demo.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface MemberMapper {
    MemberDto getMember(int id);

    List<MemberDto> getMemberList();

    int createMember(MemberDto member);

    int updateMember(MemberDto member);

    int deleteMember(int id);
}