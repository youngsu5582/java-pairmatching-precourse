package pairmatching.domain.pair;

import java.util.List;

public record PairResult (List<Pair> pairList){
    public List<String> getPairNameListWithCrewName(String crewName){
        for(Pair pair:pairList){
            if(pair.nameList().contains(crewName))
                return pair.nameList();
        }
        return List.of();
    }
}
