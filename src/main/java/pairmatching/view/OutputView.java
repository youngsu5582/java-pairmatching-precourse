package pairmatching.view;

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
}