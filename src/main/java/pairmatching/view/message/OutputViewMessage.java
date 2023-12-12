package pairmatching.view.message;

public enum OutputViewMessage {
    PREVIEW_MESSAGE("#############################################"),
    COURSE_MESSAGE("과정: %s"),
    MISSION_MESSAGE("미션:"),
    LEVEL_MESSAGE("  - %s: %s"),
    SELECT_MESSAGE("과정, 레벨, 미션을 선택하세요."),
    EXAMPLE_MESSAGE("ex) 백엔드, 레벨1, 자동차경주");
    private final String message;

    OutputViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String getFormattedMessage(Object... args){
        return String.format(message,args);
    }
}
