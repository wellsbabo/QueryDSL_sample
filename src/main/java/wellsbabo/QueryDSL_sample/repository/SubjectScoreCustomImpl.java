package wellsbabo.QueryDSL_sample.repository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import wellsbabo.QueryDSL_sample.controller.dto.SubjectScoreResponse;
import wellsbabo.QueryDSL_sample.model.QScore;
import wellsbabo.QueryDSL_sample.model.QStudent;

import java.util.List;

@RequiredArgsConstructor
public class SubjectScoreCustomImpl implements SubjectScoreCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<SubjectScoreResponse> findScoresByStudent(Long studentId) {
        QStudent st = QStudent.student;
        QScore sc = QScore.score1;

        JPAQuery<Tuple> query = queryFactory.select(
                st.studentId,
                st.name,
                st.age,
                sc.subject,
                sc.score
                )
                .from(st)
                .join(sc)
                .on(st.studentId.eq(sc.studentId))
                .where(st.studentId.eq(studentId))
                .orderBy(st.studentId.asc());

        return query.fetchJoin().fetch().stream().map(tuple -> SubjectScoreResponse.builder()
                .studentId(tuple.get(st.studentId))
                .name(tuple.get(st.name))
                .age(tuple.get(st.age))
                .subject(tuple.get(sc.subject))
                .score(tuple.get(sc.score))
                .build()).toList();
    }
}
