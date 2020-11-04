package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

abstract class LottieInterpolatedValue<T> extends LottieValueCallback<T> {
    private final T endValue;
    private final Interpolator interpolator;
    private final T startValue;

    LottieInterpolatedValue(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return interpolateValue(this.startValue, this.endValue, this.interpolator.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    /* access modifiers changed from: package-private */
    public abstract T interpolateValue(T t, T t2, float f2);

    LottieInterpolatedValue(T t, T t2, Interpolator interpolator2) {
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator2;
    }
}
