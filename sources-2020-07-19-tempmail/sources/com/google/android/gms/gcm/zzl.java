package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzl {

    /* renamed from: d  reason: collision with root package name */
    public static final zzl f3252d = new zzl(0, 30, 3600);

    /* renamed from: a  reason: collision with root package name */
    private final int f3253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3254b = 30;

    /* renamed from: c  reason: collision with root package name */
    private final int f3255c = 3600;

    private zzl(int i, int i2, int i3) {
        this.f3253a = i;
    }

    public final Bundle a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f3253a);
        bundle.putInt("initial_backoff_seconds", this.f3254b);
        bundle.putInt("maximum_backoff_seconds", this.f3255c);
        return bundle;
    }

    public final int b() {
        return this.f3253a;
    }

    public final int c() {
        return this.f3254b;
    }

    public final int d() {
        return this.f3255c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzl = (zzl) obj;
        return zzl.f3253a == this.f3253a && zzl.f3254b == this.f3254b && zzl.f3255c == this.f3255c;
    }

    public final int hashCode() {
        return (((((this.f3253a + 1) ^ 1000003) * 1000003) ^ this.f3254b) * 1000003) ^ this.f3255c;
    }

    public final String toString() {
        int i = this.f3253a;
        int i2 = this.f3254b;
        int i3 = this.f3255c;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=");
        sb.append(i2);
        sb.append(" maximum_backoff=");
        sb.append(i3);
        return sb.toString();
    }
}
