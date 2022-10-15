package service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;


@Service
@SessionScope
@SpringBootApplication

public class ShoppingServiceImpl implements ShoppingService {
    private Set<Integer> items;


    public ShoppingServiceImpl(Set<Integer> items) {
        this.items = items;
    }

    @Override
    public void add(Set<Integer> itemIds) {
        for (Integer itemId : itemIds) {
            items.add(itemId);
        }
    }

    @Override
    public Set<Integer> get() {
        return items;
    }
}
