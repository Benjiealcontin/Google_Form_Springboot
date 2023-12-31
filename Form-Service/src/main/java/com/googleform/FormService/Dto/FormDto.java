package com.googleform.FormService.Dto;

import com.googleform.FormService.Request.QuestionsRequest;
import lombok.Data;

import java.util.List;

@Data
public class FormDto {
    private Long id;
    private String title;
    private String code;
    private List<QuestionsDto> questionsList;
}
