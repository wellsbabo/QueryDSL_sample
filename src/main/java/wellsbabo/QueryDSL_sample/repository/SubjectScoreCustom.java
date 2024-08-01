package wellsbabo.QueryDSL_sample.repository;

import wellsbabo.QueryDSL_sample.controller.dto.SubjectScoreResponse;

import java.util.List;

public interface SubjectScoreCustom {
    List<SubjectScoreResponse> findScoresByStudent(Long studentId);
}
