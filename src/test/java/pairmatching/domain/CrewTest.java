package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CrewTest {
    @Test
    @DisplayName("코스와 이름을 통해 크루를 생성한다.")
    void createCrew(){
        //Given
        Course course = Course.BACKEND;
        String crewName = "영수";

        //When
        Crew crew = new Crew(course,crewName);

        //Then
        Assertions.assertInstanceOf(Crew.class,crew);
        Assertions.assertEquals(crew.name(),crewName);
        Assertions.assertEquals(crew.course(),course);
    }
}
