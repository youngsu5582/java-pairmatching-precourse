package pairmatching.service;

import pairmatching.domain.Level;
import pairmatching.domain.mission.Mission;
import pairmatching.domain.mission.MissionBoard;

import java.util.List;

public class MissionService {
    private static final List<Mission> missionList;

    static {
        missionList = List.of(
                new Mission(Level.LEVEL1, "자동차경주"),
                new Mission(Level.LEVEL1, "로또"),
                new Mission(Level.LEVEL1, "숫자야구게임"),
                new Mission(Level.LEVEL2, "장바구니"),
                new Mission(Level.LEVEL2, "결제"),
                new Mission(Level.LEVEL2, "지하철노선도"),
                new Mission(Level.LEVEL4, "성능개선"),
                new Mission(Level.LEVEL4, "배포")
        );
    }

    public MissionBoard createMissionBoard() {
        MissionBoard missionBoard = new MissionBoard(missionList);
        return missionBoard;
    }
}
