package b.c.a.d.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f2279a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f2280b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f2281c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f2282d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f2283e = 1;

    public i(long j, long j2) {
        this.f2279a = j;
        this.f2280b = j2;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f2282d = valueAnimator.getRepeatCount();
        iVar.f2283e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f2266b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f2267c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f2268d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f2279a;
    }

    public long d() {
        return this.f2280b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2281c;
        return timeInterpolator != null ? timeInterpolator : a.f2266b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f2282d;
    }

    public int h() {
        return this.f2283e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f2279a = j;
        this.f2280b = j2;
        this.f2281c = timeInterpolator;
    }
}
