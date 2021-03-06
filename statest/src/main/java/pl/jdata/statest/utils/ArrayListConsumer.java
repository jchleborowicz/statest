package pl.jdata.statest.utils;

import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.Lists;

public class ArrayListConsumer<T> implements Consumer<T> {

    private final List<T> content = Lists.newArrayList();

    @Override
    public void accept(T t) {
        content.add(t);
    }

    public List<T> getContent() {
        return content;
    }
}
