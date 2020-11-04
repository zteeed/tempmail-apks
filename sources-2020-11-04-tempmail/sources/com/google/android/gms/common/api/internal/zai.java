package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class zai<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3076a = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f3077b;

    /* renamed from: c  reason: collision with root package name */
    private final Api<O> f3078c;

    /* renamed from: d  reason: collision with root package name */
    private final O f3079d;

    private zai(Api<O> api, O o) {
        this.f3078c = api;
        this.f3079d = o;
        this.f3077b = Objects.b(api, o);
    }

    public static <O extends Api.ApiOptions> zai<O> a(Api<O> api) {
        return new zai<>(api);
    }

    public static <O extends Api.ApiOptions> zai<O> b(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    public final String c() {
        return this.f3078c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zai = (zai) obj;
        return !this.f3076a && !zai.f3076a && Objects.a(this.f3078c, zai.f3078c) && Objects.a(this.f3079d, zai.f3079d);
    }

    public final int hashCode() {
        return this.f3077b;
    }

    private zai(Api<O> api) {
        this.f3078c = api;
        this.f3079d = null;
        this.f3077b = System.identityHashCode(this);
    }
}
