package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class zai<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2888a = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f2889b;

    /* renamed from: c  reason: collision with root package name */
    private final Api<O> f2890c;

    /* renamed from: d  reason: collision with root package name */
    private final O f2891d;

    private zai(Api<O> api, O o) {
        this.f2890c = api;
        this.f2891d = o;
        this.f2889b = Objects.b(api, o);
    }

    public static <O extends Api.ApiOptions> zai<O> a(Api<O> api) {
        return new zai<>(api);
    }

    public static <O extends Api.ApiOptions> zai<O> b(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    public final String c() {
        return this.f2890c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zai = (zai) obj;
        return !this.f2888a && !zai.f2888a && Objects.a(this.f2890c, zai.f2890c) && Objects.a(this.f2891d, zai.f2891d);
    }

    public final int hashCode() {
        return this.f2889b;
    }

    private zai(Api<O> api) {
        this.f2890c = api;
        this.f2891d = null;
        this.f2889b = System.identityHashCode(this);
    }
}
