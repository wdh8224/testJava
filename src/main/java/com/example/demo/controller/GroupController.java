package com.example.demo.controller;
import com.example.demo.dto.GroupDto;
import com.example.demo.service.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @ResponseBody
    @GetMapping(value = "/groups")
    public List<GroupDto> getGroupsList(){
        return groupService.getGroupList();
    }

    @ResponseBody
    @GetMapping(value = "/groups/info")
    public GroupDto getGroupInfo(@RequestParam(value = "groupId") int id){
        return groupService.getGroupInfo(id);
    }

    //과목명 시간표 조회 api

    //과목 검색 api

    // 과목 저장 api

    // 사람들마다 시간표 저장하는 table 만들기


}
