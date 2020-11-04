package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzgf {

    /* renamed from: a  reason: collision with root package name */
    private volatile zzgw f9832a;

    /* renamed from: b  reason: collision with root package name */
    private volatile zzeg f9833b;

    static {
        zzfb.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzgw c(com.google.android.gms.internal.measurement.zzgw r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzgw r0 = r1.f9832a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzgw r0 = r1.f9832a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f9832a = r2     // Catch:{ zzfw -> 0x0012 }
            com.google.android.gms.internal.measurement.zzeg r0 = com.google.android.gms.internal.measurement.zzeg.f9791c     // Catch:{ zzfw -> 0x0012 }
            r1.f9833b = r0     // Catch:{ zzfw -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f9832a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzeg r2 = com.google.android.gms.internal.measurement.zzeg.f9791c     // Catch:{ all -> 0x001a }
            r1.f9833b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzgw r2 = r1.f9832a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgf.c(com.google.android.gms.internal.measurement.zzgw):com.google.android.gms.internal.measurement.zzgw");
    }

    public final zzgw a(zzgw zzgw) {
        zzgw zzgw2 = this.f9832a;
        this.f9833b = null;
        this.f9832a = zzgw;
        return zzgw2;
    }

    public final int b() {
        if (this.f9833b != null) {
            return this.f9833b.h();
        }
        if (this.f9832a != null) {
            return this.f9832a.i();
        }
        return 0;
    }

    public final zzeg d() {
        if (this.f9833b != null) {
            return this.f9833b;
        }
        synchronized (this) {
            if (this.f9833b != null) {
                zzeg zzeg = this.f9833b;
                return zzeg;
            }
            if (this.f9832a == null) {
                this.f9833b = zzeg.f9791c;
            } else {
                this.f9833b = this.f9832a.d();
            }
            zzeg zzeg2 = this.f9833b;
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
        zzgw zzgw = this.f9832a;
        zzgw zzgw2 = zzgf.f9832a;
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
