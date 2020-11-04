package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzgf {

    /* renamed from: a  reason: collision with root package name */
    private volatile zzgw f9649a;

    /* renamed from: b  reason: collision with root package name */
    private volatile zzeg f9650b;

    static {
        zzfb.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzgw c(com.google.android.gms.internal.measurement.zzgw r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzgw r0 = r1.f9649a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzgw r0 = r1.f9649a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f9649a = r2     // Catch:{ zzfw -> 0x0012 }
            com.google.android.gms.internal.measurement.zzeg r0 = com.google.android.gms.internal.measurement.zzeg.f9608c     // Catch:{ zzfw -> 0x0012 }
            r1.f9650b = r0     // Catch:{ zzfw -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f9649a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzeg r2 = com.google.android.gms.internal.measurement.zzeg.f9608c     // Catch:{ all -> 0x001a }
            r1.f9650b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzgw r2 = r1.f9649a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgf.c(com.google.android.gms.internal.measurement.zzgw):com.google.android.gms.internal.measurement.zzgw");
    }

    public final zzgw a(zzgw zzgw) {
        zzgw zzgw2 = this.f9649a;
        this.f9650b = null;
        this.f9649a = zzgw;
        return zzgw2;
    }

    public final int b() {
        if (this.f9650b != null) {
            return this.f9650b.h();
        }
        if (this.f9649a != null) {
            return this.f9649a.i();
        }
        return 0;
    }

    public final zzeg d() {
        if (this.f9650b != null) {
            return this.f9650b;
        }
        synchronized (this) {
            if (this.f9650b != null) {
                zzeg zzeg = this.f9650b;
                return zzeg;
            }
            if (this.f9649a == null) {
                this.f9650b = zzeg.f9608c;
            } else {
                this.f9650b = this.f9649a.d();
            }
            zzeg zzeg2 = this.f9650b;
            return zzeg2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgf)) {
            return false;
        }
        zzgf zzgf = (zzgf) obj;
        zzgw zzgw = this.f9649a;
        zzgw zzgw2 = zzgf.f9649a;
        if (zzgw == null && zzgw2 == null) {
            return d().equals(zzgf.d());
        }
        if (zzgw != null && zzgw2 != null) {
            return zzgw.equals(zzgw2);
        }
        if (zzgw != null) {
            return zzgw.equals(zzgf.c(zzgw.b()));
        }
        return c(zzgw2.b()).equals(zzgw2);
    }

    public int hashCode() {
        return 1;
    }
}
