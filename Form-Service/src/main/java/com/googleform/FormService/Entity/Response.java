package com.googleform.FormService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String response;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Questions questions;
    @ManyToOne
    @JoinColumn(name = "respondents_id")
    private Respondents respondents;
}
