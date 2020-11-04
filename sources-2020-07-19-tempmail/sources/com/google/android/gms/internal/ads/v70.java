package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class v70 extends r50 {

    /* renamed from: b  reason: collision with root package name */
    private final x70 f5110b = new x70(this.f5112d, (v70) null);

    /* renamed from: c  reason: collision with root package name */
    private zzeew f5111c = b();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w70 f5112d;

    v70(w70 w70) {
        this.f5112d = w70;
    }

    private final zzeew b() {
        if (this.f5110b.hasNext()) {
            return (zzeew) ((v50) this.f5110b.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f5111c != null;
    }

    public final byte nextByte() {
        zzeew zzeew = this.f5111c;
        if (zzeew != null) {
            byte nextByte = zzeew.nextByte();
            if (!this.f5111c.hasNext()) {
                this.f5111c = b();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
