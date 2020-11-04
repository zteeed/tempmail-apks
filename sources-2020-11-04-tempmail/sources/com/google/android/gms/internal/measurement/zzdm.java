package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzdm {
    public static <T> zzdj<T> a(zzdj<T> zzdj) {
        if ((zzdj instanceof z0) || (zzdj instanceof x0)) {
            return zzdj;
        }
        if (zzdj instanceof Serializable) {
            return new x0(zzdj);
        }
        return new z0(zzdj);
    }

    public static <T> zzdj<T> b(@NullableDecl T t) {
        return new y0(t);
    }
}
