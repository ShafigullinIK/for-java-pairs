package io.hexlet.pairs;

import java.util.function.*;

enum Messages {
    CAR,
    CDR
}

public interface PairType<T> extends Function<Messages, T> {};
