package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CrewBoardTest {

    @Test
    @DisplayName("크루들을 통해 크루 명단을 생성한다.")
    void createCrewBoard(){
        //Given
        Crew crew1 = new Crew(Course.BACKEND,"영수");
        Crew crew2 = new Crew(Course.FRONTEND,"병준");
        List<Crew> crewList = List.of(crew1,crew2);

        //When
        CrewBoard crewBoard = new CrewBoard(crewList);

        Assertions.assertEquals(crewBoard.getCrewNameList(Course.BACKEND).size(),1);

    }
}
