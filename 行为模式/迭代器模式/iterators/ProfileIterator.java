package 行为模式.迭代器模式.iterators;

import 行为模式.迭代器模式.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}