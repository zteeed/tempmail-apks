package com.airbnb.lottie.value;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

public class LottieValueCallback<T> {
    private BaseKeyframeAnimation<?, ?> animation;
    private final LottieFrameInfo<T> frameInfo = new LottieFrameInfo<>();
    protected T value = null;

    public LottieValueCallback() {
    }

    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    public final T getValueInternal(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        return getValue(this.frameInfo.set(f2, f3, t, t2, f4, f5, f6));
    }

    public final void setAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animation = baseKeyframeAnimation;
    }

    public final void setValue(T t) {
        this.value = t;
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.animation;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public LottieValueCallback(T t) {
        this.value = t;
    }
}
