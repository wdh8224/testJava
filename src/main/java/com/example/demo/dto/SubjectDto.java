package com.example.demo.dto;

import lombok.*;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Setter
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PACKAGE)
public class SubjectDto {
    private int subjectId;
    private String subjectName;
    private String professiorName;
    private String subjectDay;
}
