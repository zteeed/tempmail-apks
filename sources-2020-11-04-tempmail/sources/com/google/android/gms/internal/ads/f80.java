package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class f80 extends l80 {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e80 f3952c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f80(e80 e80) {
        super(e80, (d80) null);
        this.f3952c = e80;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new g80(this.f3952c, (d80) null);
    }

    /* synthetic */ f80(e80 e80, d80 d80) {
        this(e80);
    }
}
