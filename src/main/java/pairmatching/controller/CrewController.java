package pairmatching.controller;

import pairmatching.domain.crew.CrewBoard;
import pairmatching.service.CrewService;

public class CrewController {
    private final CrewService crewService;
    public CrewController(CrewService crewService){
        this.crewService = crewService;
    }
    public CrewBoard createCrewBoard(){
        return crewService.createCrewBoard();
    }
}
