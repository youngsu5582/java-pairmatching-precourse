package pairmatching.domain.crew;

import pairmatching.domain.Course;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class CrewBoard {
    private EnumMap<Course, List<String>> crewBoard;

    public CrewBoard(List<Crew> crewList) {
        this.crewBoard = initCrewBoard();
        for (Crew crew : crewList) {
            crewBoard.get(crew.course()).add(crew.name());
        }
    }
    public List<String> getCrewNameList(Course course){
        return crewBoard.get(course);
    }
    private EnumMap<Course, List<String>> initCrewBoard() {

        EnumMap<Course, List<String>> crewBoard = new EnumMap<Course, List<String>>(Course.class);
        for (Course course : Course.values()) {
            crewBoard.put(course, new ArrayList<>());
        }
        return crewBoard;
    }

}
