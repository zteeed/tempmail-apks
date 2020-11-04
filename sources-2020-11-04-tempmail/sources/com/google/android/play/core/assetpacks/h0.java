package com.google.android.play.core.assetpacks;

import java.util.Map;

final class h0 extends c {

    /* renamed from: a  reason: collision with root package name */
    private final long f11270a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f11271b;

    h0(long j, Map<String, b> map) {
        this.f11270a = j;
        this.f11271b = map;
    }

    public final Map<String, b> e() {
        return this.f11271b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f11270a == cVar.f() && this.f11271b.equals(cVar.e());
        }
    }

    public final long f() {
        return this.f11270a;
    }

    public final int hashCode() {
        long j = this.f11270a;
        return this.f11271b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f11270a;
        String valueOf = String.valueOf(this.f11271b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
