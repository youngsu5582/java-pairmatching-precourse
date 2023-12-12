package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PairResultTest {
    @Test
    @DisplayName("페어들을 통해 페어결과를 만든다")
    void createPairResult(){
        //Given
        Pair pair1 = new Pair(List.of("민우","성현"));
        Pair pair2 = new Pair(List.of("영수","병준"));
        List<Pair> pairList = List.of(pair1,pair2);

        //When
        PairResult pairResult = new PairResult(pairList);

        //Then
        Assertions.assertInstanceOf(PairResult.class,pairResult);
    }
    @Test
    @DisplayName("크루의 이름을 통해 자신이 속한 페어를 찾는다")
    void getPairWithCrewName(){
        //Given
        Pair pair1 = new Pair(List.of("민우","성현"));
        Pair pair2 = new Pair(List.of("영수","병준"));
        List<Pair> pairList = List.of(pair1,pair2);
        String crewName = "영수";

        //When
        PairResult pairResult = new PairResult(pairList);
        List<String> crewNameList = pairResult.getPairNameListWithCrewName(crewName);

        //Then
        Assertions.assertTrue(crewNameList.contains("병준"));
    }
}
