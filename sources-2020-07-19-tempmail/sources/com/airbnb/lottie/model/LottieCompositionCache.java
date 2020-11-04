package com.airbnb.lottie.model;

import a.e.e;
import com.airbnb.lottie.LottieComposition;

public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final e<String, LottieComposition> cache = new e<>(20);

    LottieCompositionCache() {
    }

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.c();
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return this.cache.d(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str != null) {
            this.cache.e(str, lottieComposition);
        }
    }

    public void resize(int i) {
        this.cache.f(i);
    }
}
