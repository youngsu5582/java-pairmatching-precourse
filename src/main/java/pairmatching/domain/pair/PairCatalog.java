package pairmatching.domain.pair;

import pairmatching.domain.Course;
import pairmatching.domain.Level;

public record PairCatalog(Course course, Level level, String missionName) {
}
