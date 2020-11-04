package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

public class LottieInterpolatedPointValue extends LottieInterpolatedValue<PointF> {
    private final PointF point = new PointF();

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
    }

    /* access modifiers changed from: package-private */
    public PointF interpolateValue(PointF pointF, PointF pointF2, float f2) {
        this.point.set(MiscUtils.lerp(pointF.x, pointF2.x, f2), MiscUtils.lerp(pointF.y, pointF2.y, f2));
        return this.point;
    }

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
    }
}
