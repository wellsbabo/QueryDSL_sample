package wellsbabo.QueryDSL_sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wellsbabo.QueryDSL_sample.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
