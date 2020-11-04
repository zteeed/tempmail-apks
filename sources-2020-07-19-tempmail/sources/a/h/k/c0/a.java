package a.h.k.c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    private final int f373b;

    /* renamed from: c  reason: collision with root package name */
    private final d f374c;

    /* renamed from: d  reason: collision with root package name */
    private final int f375d;

    public a(int i, d dVar, int i2) {
        this.f373b = i;
        this.f374c = dVar;
        this.f375d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f373b);
        this.f374c.O(this.f375d, bundle);
    }
}
