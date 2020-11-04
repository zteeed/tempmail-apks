package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class v70 extends r50 {

    /* renamed from: b  reason: collision with root package name */
    private final x70 f5293b = new x70(this.f5295d, (v70) null);

    /* renamed from: c  reason: collision with root package name */
    private zzeew f5294c = b();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w70 f5295d;

    v70(w70 w70) {
        this.f5295d = w70;
    }

    private final zzeew b() {
        if (this.f5293b.hasNext()) {
            return (zzeew) ((v50) this.f5293b.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f5294c != null;
    }

    public final byte nextByte() {
        zzeew zzeew = this.f5294c;
        if (zzeew != null) {
            byte nextByte = zzeew.nextByte();
            if (!this.f5294c.hasNext()) {
                this.f5294c = b();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
