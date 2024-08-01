package wellsbabo.QueryDSL_sample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wellsbabo.QueryDSL_sample.controller.dto.SubjectScoreResponse;
import wellsbabo.QueryDSL_sample.repository.SubjectScoreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectScoreService {
    private final SubjectScoreRepository repository;

    public List<SubjectScoreResponse> findScoresByStudent(Long studentId){
        return repository.findScoresByStudent(studentId);
    }
}
