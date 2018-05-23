package edu.tseidler;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Subsets<T> {
    private final List<T> list;
    private final Set<Set<T>> subsets;

    public Subsets(List<T> starting) {
        this.list = starting;
        subsets = calcSubsets();
    }

    public Set<Set<T>> getSubsets() {
        return subsets;
    }

    private Set<Set<T>> calcSubsets() {
        Set<Set<T>> result = new LinkedHashSet<>();
        result.add(new LinkedHashSet<>());
        return calcSubsets(0, result);
    }

    private Set<Set<T>> calcSubsets(int start, Set<Set<T>> sets) {
        if (start >= list.size()) {
            return sets;
        }
        Set<Set<T>> newSets = deepCopy(sets);
        newSets.forEach(s -> s.add(list.get(start)));
        sets.addAll(newSets);
        return calcSubsets(start + 1, sets);
    }

    private Set<Set<T>> deepCopy(Set<Set<T>> sets) {
        Set<Set<T>> result = new LinkedHashSet<>(sets.size());
        for (Set<T> set : sets) {
            Set<T> inner = new LinkedHashSet<>();
            for (T t : set) {
                inner.add(t);
            }
            result.add(inner);
        }
        return result;
    }
}
