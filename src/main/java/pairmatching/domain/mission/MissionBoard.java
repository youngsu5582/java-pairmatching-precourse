package pairmatching.domain.mission;

import pairmatching.domain.Level;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class MissionBoard {
    private EnumMap<Level, List<String>> missionBoard;
    public MissionBoard(List<Mission> missionList){
        this.missionBoard = initMissionBoard();
        for (Mission mission : missionList) {
            missionBoard.get(mission.level()).add(mission.missionName());
        }
    }
    private EnumMap<Level, List<String>> initMissionBoard() {

        EnumMap<Level, List<String>> missionBoard = new EnumMap(Level.class);
        for (Level level : Level.values()) {
            missionBoard.put(level, new ArrayList<>());
        }
        return missionBoard;
    }
    public List<String> getMissionNameList(Level level){
        return missionBoard.get(level);
    }
}
