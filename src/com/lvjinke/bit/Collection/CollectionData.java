package com.lvjinke.bit.Collection;

import com.lvjinke.bit.Generics.Generator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionData<T> extends ArrayList<T> {
    CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<>(gen, quantity);
    }
}

