package com.team3.ossproject.challenge.dto.request;

import com.team3.ossproject.challenge.domain.Duration;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Schema(description = "Request DTO for creating a new challenge")
public class CreateChallengeRequest {

    @Schema(description = "Challenge title", example = "Study English Voca")
    private String title;

    @Schema(description = "Challenge Description", example = "Study vocabulary for IELTS")
    private String description;

    @Schema(description = "Start Date", example = "2024-12-16")
    private LocalDate startDate;

    @Schema(description = "Duration of Challenge", example = "DAY_50")
    private Duration duration;

}

