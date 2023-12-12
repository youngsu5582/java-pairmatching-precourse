package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PairTest {
    @Test
    @DisplayName("페어하는 크루명 들을 통해 페어를 만든다.")
    void createPair(){
        List<String> pairNameList = List.of("병준","영수");

        Pair pair = new Pair(pairNameList);

        Assertions.assertInstanceOf(Pair.class,pair);
        Assertions.assertEquals(pair.nameList().size(),2);
    }
}
