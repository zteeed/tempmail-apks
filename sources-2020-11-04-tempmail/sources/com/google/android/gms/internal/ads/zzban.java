package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzban {

    /* renamed from: a  reason: collision with root package name */
    private final View f6289a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f6290b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6291c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6292d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6293e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f6294f;

    public zzban(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f6290b = activity;
        this.f6289a = view;
        this.f6294f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver d(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        ViewTreeObserver d2;
        if (!this.f6291c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6294f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f6290b;
                if (!(activity == null || (d2 = d(activity)) == null)) {
                    d2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                zzq.zzlt();
                zzbbv.a(this.f6289a, this.f6294f);
            }
            this.f6291c = true;
        }
    }

    private final void h() {
        ViewTreeObserver d2;
        Activity activity = this.f6290b;
        if (activity != null && this.f6291c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f6294f;
            if (!(onGlobalLayoutListener == null || (d2 = d(activity)) == null)) {
                zzq.zzky();
                d2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f6291c = false;
        }
    }

    public final void a() {
        this.f6292d = true;
        if (this.f6293e) {
            g();
        }
    }

    public final void b() {
        this.f6292d = false;
        h();
    }

    public final void c(Activity activity) {
        this.f6290b = activity;
    }

    public final void e() {
        this.f6293e = true;
        if (this.f6292d) {
            g();
        }
    }

    public final void f() {
        this.f6293e = false;
        h();
    }
}
