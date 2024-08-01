package wellsbabo.QueryDSL_sample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wellsbabo.QueryDSL_sample.controller.dto.SubjectScoreResponse;
import wellsbabo.QueryDSL_sample.service.SubjectScoreService;

import java.util.List;

@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectScoreController {

    private final SubjectScoreService service;

    @GetMapping(value="/score/{studentId}")
    public ResponseEntity<List<SubjectScoreResponse>> getScoresByStudent(@PathVariable Long studentId){
        List<SubjectScoreResponse> subjectScoreList = service.findScoresByStudent(studentId);
        return ResponseEntity.ok(subjectScoreList);
    }

}
