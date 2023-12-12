package pairmatching.view;

import pairmatching.domain.Course;
import pairmatching.domain.Level;
import pairmatching.domain.mission.MissionBoard;
import pairmatching.view.message.OutputViewMessage;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    private static OutputView INSTANCE=null;
    public static synchronized OutputView getInstance(){
        if(INSTANCE==null){
            INSTANCE = new OutputView();
        }
        return INSTANCE;
    }
    private void printNewLine() {
        System.out.println();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
    public void printPreviewMessage(MissionBoard missionBoard){
        printMessage(OutputViewMessage.PREVIEW_MESSAGE.getMessage());

        printCourseMessage();
        printMissionMessage(missionBoard);

        printMessage(OutputViewMessage.PREVIEW_MESSAGE.getMessage());
        printMessage(OutputViewMessage.SELECT_MESSAGE.getMessage());
        printMessage(OutputViewMessage.EXAMPLE_MESSAGE.getMessage());
    }


    private void printCourseMessage(){
        List<String> courseNameList = Arrays.stream(Course.values()).map(course -> course.getName()).toList();
        String courseNameString = String.join(" | ",courseNameList);
        printMessage(OutputViewMessage.COURSE_MESSAGE.getFormattedMessage(courseNameString));
    }
    private void printMissionMessage(MissionBoard missionBoard){
        printMessage(OutputViewMessage.MISSION_MESSAGE.getMessage());
        for(Level level:Level.values()){
            List<String> missionNameList = missionBoard.getMissionNameList(level);
            String missionNameString = String.join(" | ",missionNameList);
            printMessage(OutputViewMessage.LEVEL_MESSAGE.getFormattedMessage(level.getName(),missionNameString));
        }
    }
}