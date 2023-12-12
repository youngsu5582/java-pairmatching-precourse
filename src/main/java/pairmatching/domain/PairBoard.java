package pairmatching.domain;

import java.util.HashMap;

public class PairBoard {
    private HashMap<PairCatalog, PairResult> pairBoard;

    PairBoard() {
        pairBoard = new HashMap<>();
    }

    public void addPairResult(PairCatalog pairCatalog, PairResult pairResult) {
        pairBoard.put(pairCatalog, pairResult);
    }

    public PairResult getPairResultWithCatalog(PairCatalog pairCatalog) {
        return pairBoard.get(pairCatalog);
    }


}
