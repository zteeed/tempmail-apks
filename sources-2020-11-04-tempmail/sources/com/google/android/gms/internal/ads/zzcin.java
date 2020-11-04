package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcin extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final zzayv f7283b;

    public zzcin(Context context, View view, zzayv zzayv) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f7283b = zzayv;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7283b.h(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof zzbfn)) {
                arrayList.add((zzbfn) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzbfn) obj).destroy();
        }
    }
}
