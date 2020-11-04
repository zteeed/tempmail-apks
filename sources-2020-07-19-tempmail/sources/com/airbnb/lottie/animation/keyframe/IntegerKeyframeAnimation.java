package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    public int getIntValue(Keyframe<Integer> keyframe, float f2) {
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != null) {
            Integer num = (Integer) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f2, getLinearCurrentKeyframeProgress(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return MiscUtils.lerp(keyframe.getStartValueInt(), keyframe.getEndValueInt(), f2);
    }

    /* access modifiers changed from: package-private */
    public Integer getValue(Keyframe<Integer> keyframe, float f2) {
        return Integer.valueOf(getIntValue(keyframe, f2));
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
