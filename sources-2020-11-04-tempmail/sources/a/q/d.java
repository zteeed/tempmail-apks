package a.q;

import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Fade */
public class d extends i0 {

    /* compiled from: Fade */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f515a;

        a(d dVar, View view) {
            this.f515a = view;
        }

        public void c(m mVar) {
            d0.h(this.f515a, 1.0f);
            d0.a(this.f515a);
            mVar.b0(this);
        }
    }

    /* compiled from: Fade */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f516a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f517b = false;

        b(View view) {
            this.f516a = view;
        }

        public void onAnimationEnd(Animator animator) {
            d0.h(this.f516a, 1.0f);
            if (this.f517b) {
                this.f516a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (u.E(this.f516a) && this.f516a.getLayerType() == 0) {
                this.f517b = true;
                this.f516a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i) {
        u0(i);
    }

    private Animator v0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        d0.h(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, d0.f521d, new float[]{f3});
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f588a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float w0(a.q.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f588a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q.d.w0(a.q.s, float):float");
    }

    public void k(s sVar) {
        super.k(sVar);
        sVar.f588a.put("android:fade:transitionAlpha", Float.valueOf(d0.d(sVar.f589b)));
    }

    public Animator q0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f2 = 0.0f;
        float w0 = w0(sVar, 0.0f);
        if (w0 != 1.0f) {
            f2 = w0;
        }
        return v0(view, f2, 1.0f);
    }

    public Animator s0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        d0.f(view);
        return v0(view, w0(sVar, 1.0f), 0.0f);
    }
}
