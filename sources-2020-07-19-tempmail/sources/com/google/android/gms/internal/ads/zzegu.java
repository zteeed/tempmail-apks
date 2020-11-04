package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzegu {

    /* renamed from: a  reason: collision with root package name */
    private volatile zzehl f8584a;

    /* renamed from: b  reason: collision with root package name */
    private volatile zzeer f8585b;

    static {
        zzefo.b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.zzehl c(com.google.android.gms.internal.ads.zzehl r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzehl r0 = r1.f8584a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzehl r0 = r1.f8584a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f8584a = r2     // Catch:{ zzegl -> 0x0012 }
            com.google.android.gms.internal.ads.zzeer r0 = com.google.android.gms.internal.ads.zzeer.f8533c     // Catch:{ zzegl -> 0x0012 }
            r1.f8585b = r0     // Catch:{ zzegl -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f8584a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.zzeer r2 = com.google.android.gms.internal.ads.zzeer.f8533c     // Catch:{ all -> 0x001a }
            r1.f8585b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.zzehl r2 = r1.f8584a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegu.c(com.google.android.gms.internal.ads.zzehl):com.google.android.gms.internal.ads.zzehl");
    }

    public final zzeer a() {
        if (this.f8585b != null) {
            return this.f8585b;
        }
        synchronized (this) {
            if (this.f8585b != null) {
                zzeer zzeer = this.f8585b;
                return zzeer;
            }
            if (this.f8584a == null) {
                this.f8585b = zzeer.f8533c;
            } else {
                this.f8585b = this.f8584a.e();
            }
            zzeer zzeer2 = this.f8585b;
            return zzeer2;
        }
    }

    public final int b() {
        if (this.f8585b != null) {
            return this.f8585b.size();
        }
        if (this.f8584a != null) {
            return this.f8584a.f();
        }
        return 0;
    }

    public final zzehl d(zzehl zzehl) {
        zzehl zzehl2 = this.f8584a;
        this.f8585b = null;
        this.f8584a = zzehl;
        return zzehl2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzegu)) {
            return false;
        }
        zzegu zzegu = (zzegu) obj;
        zzehl zzehl = this.f8584a;
        zzehl zzehl2 = zzegu.f8584a;
        if (zzehl == null && zzehl2 == null) {
            return a().equals(zzegu.a());
        }
        if (zzehl != null && zzehl2 != null) {
            return zzehl.equals(zzehl2);
        }
        if (zzehl != null) {
            return zzehl.equals(zzegu.c(zzehl.d()));
        }
        return c(zzehl2.d()).equals(zzehl2);
    }

    public int hashCode() {
        return 1;
    }
}
