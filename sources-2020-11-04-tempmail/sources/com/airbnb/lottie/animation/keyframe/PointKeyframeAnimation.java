package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {
    private final PointF point = new PointF();

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
    }

    public PointF getValue(Keyframe<PointF> keyframe, float f2) {
        T t;
        T t2 = keyframe.startValue;
        if (t2 == null || (t = keyframe.endValue) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != null) {
            PointF pointF3 = (PointF) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), pointF, pointF2, f2, getLinearCurrentKeyframeProgress(), getProgress());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.point;
        float f3 = pointF.x;
        float f4 = pointF.y;
        pointF4.set(f3 + ((pointF2.x - f3) * f2), f4 + (f2 * (pointF2.y - f4)));
        return this.point;
    }
}
