package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MissionBoardTest {
    @Test
    @DisplayName("미션들을 통해 미션 명단을 생성한다.")
    void createMissionBoard(){
        //Given
        Mission mission1 = new Mission(Level.LEVEL1,"숫자야구게임");
        Mission mission2 = new Mission(Level.LEVEL1,"로또");
        List<Mission> missionList = List.of(mission1,mission2);

        //When
        MissionBoard missionBoard = new MissionBoard(missionList);

        Assertions.assertEquals(missionBoard.getMissionNameList(Level.LEVEL1).size(),2);
    }
}
