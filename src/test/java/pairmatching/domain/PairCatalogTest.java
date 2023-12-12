package pairmatching.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pairmatching.domain.pair.PairCatalog;

public class PairCatalogTest {
    @Test
    @DisplayName("Course 와 Level 과 미션명을 통해 페어 카탈로그를 생성한다.")
    void createPairCatalog(){
        //Given
        Course course = Course.BACKEND;
        Level level = Level.LEVEL4;
        String missionName = "성능개선";

        //When
        PairCatalog pairCatalog = new PairCatalog(course,level,missionName);
        PairCatalog pairCatalog1 = new PairCatalog(course,level,missionName);

        //Then
        //해당 부분 에서 동일함 을 검증 하는 이유는
        //Catalog 를 통해 , 결과를 검색 하므로 검증
        Assertions.assertEquals(pairCatalog,pairCatalog1);
    }
}
