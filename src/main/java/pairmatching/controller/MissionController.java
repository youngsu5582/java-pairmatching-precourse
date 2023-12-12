package pairmatching.controller;

import pairmatching.domain.mission.MissionBoard;
import pairmatching.service.MissionService;

public class MissionController {
    MissionService missionService;
    public MissionController(MissionService missionService){
        this.missionService = missionService;
    }
    public MissionBoard createMissionBoard(){
        return missionService.createMissionBoard();
    }
}
