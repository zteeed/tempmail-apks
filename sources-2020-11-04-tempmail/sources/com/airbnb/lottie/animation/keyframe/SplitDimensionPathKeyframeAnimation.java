package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import java.util.Collections;

public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {
    private final PointF point = new PointF();
    private final BaseKeyframeAnimation<Float, Float> xAnimation;
    private final BaseKeyframeAnimation<Float, Float> yAnimation;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.xAnimation = baseKeyframeAnimation;
        this.yAnimation = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    public void setProgress(float f2) {
        this.xAnimation.setProgress(f2);
        this.yAnimation.setProgress(f2);
        this.point.set(this.xAnimation.getValue().floatValue(), this.yAnimation.getValue().floatValue());
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    public PointF getValue() {
        return getValue((Keyframe<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public PointF getValue(Keyframe<PointF> keyframe, float f2) {
        return this.point;
    }
}
