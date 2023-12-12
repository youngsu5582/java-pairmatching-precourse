package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pairmatching.domain.mission.Mission;

public class MissionTest {
    @Test
    @DisplayName("레벨 과 미션명을 통해 미션을 생성한다.")
    void createMission(){
        //Given
        Level level = Level.LEVEL1;
        String missionName = "지하철노선도";

        //When
        Mission mission = new Mission(level,missionName);

        //Then
        Assertions.assertInstanceOf(Mission.class,mission);
        Assertions.assertEquals(mission.level(),level);
        Assertions.assertEquals(mission.missionName(),missionName);
    }
}
