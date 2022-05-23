package com.example.demo.service;


import com.example.demo.dto.MemberSubjectDto;
import com.example.demo.dto.SubjectDto;
import com.example.demo.mapper.SubjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectMapper subjectMapper;

    public List<MemberSubjectDto> getMemberSubjectInfo(int memberId){
        return subjectMapper.getMemberSubjectInfo(memberId);
    }
    public SubjectDto findSubject(int subjectId){
        return subjectMapper.findBySubjectId(subjectId);
    }

}
