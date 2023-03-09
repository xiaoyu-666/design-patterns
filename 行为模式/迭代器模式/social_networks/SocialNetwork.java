package 行为模式.迭代器模式.social_networks;

import 行为模式.迭代器模式.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}