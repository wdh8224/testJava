package com.example.demo.mapper;

import com.example.demo.dto.MemberSubjectDto;
import com.example.demo.dto.SubjectDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SubjectMapper {
    List<SubjectDto> findAll();
    SubjectDto findBySubjectId(int subjectId);
    List<MemberSubjectDto> getMemberSubjectInfo(int memberId);
}
