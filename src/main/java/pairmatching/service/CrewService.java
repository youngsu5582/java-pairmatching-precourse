package pairmatching.service;

import pairmatching.domain.Course;
import pairmatching.domain.crew.Crew;
import pairmatching.domain.crew.CrewBoard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CrewService {
    private static final String BACKEND_FILE_DIR = "src/main/resources/backend-crew.md";
    private static final String FRONTEND_FILE_DIR = "src/main/resources/frontend-crew.md";

    public CrewBoard createCrewBoard() {
        List<Crew> crewList = getCrew();
        return new CrewBoard(crewList);
    }

    private List<Crew> getCrew() {
        List<Crew> backendCrewList = getBackendCrew();
        List<Crew> frontendCrewList = getFrontendCrew();
        return Stream.concat(backendCrewList.stream(), frontendCrewList.stream()).collect(Collectors.toList());
    }

    private List<Crew> getFrontendCrew() {
        File file = new File(FRONTEND_FILE_DIR);
        List<String> crewNameList = readCrewName(file);
        List<Crew> crewList = crewNameList.stream()
                .map(crewName -> new Crew(Course.BACKEND, crewName))
                .collect(Collectors.toList());
        return crewList;
    }

    private List<Crew> getBackendCrew() {

        File file = new File(BACKEND_FILE_DIR);
        List<String> crewNameList = readCrewName(file);
        List<Crew> crewList = crewNameList.stream()
                .map(crewName -> new Crew(Course.BACKEND, crewName))
                .collect(Collectors.toList());
        return crewList;
    }

    private List<String> readCrewName(File file) {
        List<String> crewNameList = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    crewNameList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return crewNameList;
    }
}
