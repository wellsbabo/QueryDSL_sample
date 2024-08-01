package wellsbabo.QueryDSL_sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wellsbabo.QueryDSL_sample.controller.dto.SubjectScoreResponse;
import wellsbabo.QueryDSL_sample.model.Score;

import java.util.List;

public interface SubjectScoreRepository extends JpaRepository<Score, Long>, SubjectScoreCustom {

}
