package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.view.message.InputViewMessage;

public class InputView {
    private static InputView INSTANCE=null;
    public static synchronized InputView getInstance(){
        if(INSTANCE==null){
            INSTANCE = new InputView();
        }
        return INSTANCE;
    }
    public String readInput(){
        return Console.readLine();
    }

}