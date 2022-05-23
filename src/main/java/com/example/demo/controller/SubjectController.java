package com.example.demo.controller;
import com.example.demo.dto.MemberSubjectDto;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SubjectController {
    private final SubjectService subjectService;

    @ResponseBody
    @GetMapping(value = "/subject")
    public SubjectDto getSubject(@RequestParam(value = "memberId") int id, Model model){
        return subjectService.findSubject(id);
    }

    @ResponseBody
    @GetMapping(value = "/subject/info")
    public List<MemberSubjectDto> getSubjectAll(@RequestParam(value = "memberId") int id, Model model){
        return subjectService.getMemberSubjectInfo(id);
    }

    //과목명 시간표 조회 api


    //과목 검색 api

    // 과목 저장 api

    // 사람들마다 시간표 저장하는 table 만들기


}
