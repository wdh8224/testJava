package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PROTECTED;


public class GroupDto {

    private int groupsId;
    private final int memberId;
    private final LocalDateTime updatedAt;
    private final LocalDateTime createdAt;
    private final LocalDateTime deletedAt;

    public int groupsId() {
        return groupsId;
    }

    public int memberId() {
        return memberId;
    }

    public LocalDateTime updatedAt() {
        return updatedAt;
    }

    @Builder
    public GroupDto(int memberId, LocalDateTime updatedAt, LocalDateTime createdAt, LocalDateTime deletedAt) {
        this.memberId = memberId;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public static GroupDto from(int memberId) {
        return GroupDto.builder()
                .memberId(memberId)
                .build();
    }

    public static GroupDto of(int memberId, LocalDateTime createdAt) {
        return GroupDto.builder()
                .memberId(memberId)
                .createdAt(createdAt)
                .build();
    }
}
