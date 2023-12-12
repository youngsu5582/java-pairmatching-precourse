package pairmatching.domain.pair;

import pairmatching.domain.Course;
import pairmatching.domain.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairBoard {
    private HashMap<PairCatalog, PairResult> pairBoard;

    public PairBoard() {
        pairBoard = new HashMap<>();
    }

    public void addPairResult(PairCatalog pairCatalog, PairResult pairResult) {
        pairBoard.put(pairCatalog, pairResult);
    }

    public PairResult getPairResultWithCatalog(PairCatalog pairCatalog) {
        return pairBoard.get(pairCatalog);
    }

    public List<PairResult> getPairResultWithCourseAndLevel(Course course, Level level) {
        List<PairResult> pairResults = new ArrayList<>();
        for (PairCatalog pairCatalog : pairBoard.keySet()) {
            if (pairCatalog.level() == level && pairCatalog.course() == course) {
                pairResults.add(pairBoard.get(pairCatalog));
            }
        }
        return pairResults;
    }
}
