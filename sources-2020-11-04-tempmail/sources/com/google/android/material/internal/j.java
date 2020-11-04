package com.google.android.material.internal;

import a.q.m;
import a.q.s;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: TextScale */
public class j extends m {

    /* compiled from: TextScale */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f11050a;

        a(j jVar, TextView textView) {
            this.f11050a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f11050a.setScaleX(floatValue);
            this.f11050a.setScaleY(floatValue);
        }
    }

    private void o0(s sVar) {
        View view = sVar.f589b;
        if (view instanceof TextView) {
            sVar.f588a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void g(s sVar) {
        o0(sVar);
    }

    public void k(s sVar) {
        o0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.f589b instanceof TextView)) {
            return null;
        }
        View view = sVar2.f589b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = sVar.f588a;
        Map<String, Object> map2 = sVar2.f588a;
        float f2 = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f2});
        ofFloat.addUpdateListener(new a(this, textView));
        return ofFloat;
    }
}
