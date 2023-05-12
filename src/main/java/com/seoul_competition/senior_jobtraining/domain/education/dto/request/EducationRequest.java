package com.seoul_competition.senior_jobtraining.domain.education.dto.request;

public record EducationRequest(
    Long originId
) {

  public static EducationRequest of(Long educationId) {
    return new EducationRequest(educationId);
  }
}
