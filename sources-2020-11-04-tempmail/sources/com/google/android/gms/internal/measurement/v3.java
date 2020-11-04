package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class v3 extends b4 {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q3 f9695c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private v3(q3 q3Var) {
        super(q3Var, (t3) null);
        this.f9695c = q3Var;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new s3(this.f9695c, (t3) null);
    }

    /* synthetic */ v3(q3 q3Var, t3 t3Var) {
        this(q3Var);
    }
}
