package com.example.demo.service;


import com.example.demo.dto.MemberDto;
import com.example.demo.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDto> getMemberList() {
        return memberMapper.getMemberList();
    }

    public MemberDto getMember(int id) {
        return memberMapper.getMember(id);
    }

    public int createMember(MemberDto member) {
        return memberMapper.createMember(member);
    }

    public int updateMember(MemberDto member) {
        return memberMapper.updateMember(member);
    }

    public int deleteMember(int id) {
        return memberMapper.deleteMember(id);
    }
}