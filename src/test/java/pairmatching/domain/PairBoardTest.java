package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PairBoardTest {
    Pair pair1 = new Pair(List.of("민우", "성현"));
    Pair pair2 = new Pair(List.of("영수", "병준"));
    PairResult pairResult = new PairResult(List.of(pair1, pair2));

    @Test
    @DisplayName("페어 보드에 , 페어 카탈로그를 활용해 페어 결과를 추가한다.")
    void addPairResult() {
        //Given
        PairBoard pairBoard = new PairBoard();
        PairCatalog pairCatalog = new PairCatalog(Course.BACKEND, Level.LEVEL1, "자동차경주");


        //When
        pairBoard.addPairResult(pairCatalog, pairResult);

        //Then
        Assertions.assertEquals(pairBoard.getPairResultWithCatalog(pairCatalog), pairResult);
    }

}
