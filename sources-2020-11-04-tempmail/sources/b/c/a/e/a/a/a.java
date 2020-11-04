package b.c.a.e.a.a;

import android.app.PendingIntent;

public abstract class a {
    public static a c(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new p(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    private final boolean f(d dVar) {
        return dVar.a() && a() <= e();
    }

    /* access modifiers changed from: package-private */
    public abstract long a();

    /* access modifiers changed from: package-private */
    public final PendingIntent b(d dVar) {
        if (dVar.b() != 0) {
            if (dVar.b() == 1) {
                if (h() != null) {
                    return h();
                }
                if (f(dVar)) {
                    return k();
                }
            }
            return null;
        } else if (j() != null) {
            return j();
        } else {
            if (f(dVar)) {
                return l();
            }
            return null;
        }
    }

    public abstract int d();

    /* access modifiers changed from: package-private */
    public abstract long e();

    public abstract long g();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent h();

    public abstract Integer i();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent j();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent k();

    /* access modifiers changed from: package-private */
    public abstract PendingIntent l();

    public abstract int m();

    public boolean n(int i) {
        return b(d.c(i)) != null;
    }

    public boolean o(d dVar) {
        return b(dVar) != null;
    }

    public abstract String p();

    public abstract long q();

    public abstract int r();

    public abstract int s();
}
