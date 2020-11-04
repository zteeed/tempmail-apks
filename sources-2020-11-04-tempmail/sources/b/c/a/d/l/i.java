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
    private long f2377a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f2378b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f2379c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f2380d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f2381e = 1;

    public i(long j, long j2) {
        this.f2377a = j;
        this.f2378b = j2;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f2380d = valueAnimator.getRepeatCount();
        iVar.f2381e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f2364b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f2365c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f2366d : interpolator;
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
        return this.f2377a;
    }

    public long d() {
        return this.f2378b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2379c;
        return timeInterpolator != null ? timeInterpolator : a.f2364b;
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
        return this.f2380d;
    }

    public int h() {
        return this.f2381e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f2377a = j;
        this.f2378b = j2;
        this.f2379c = timeInterpolator;
    }
}
