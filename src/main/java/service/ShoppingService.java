package service;

import java.util.Set;

public interface ShoppingService {
    void add(Set<Integer> itemIds);

    Set<Integer> get();
}
