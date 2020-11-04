package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzl {

    /* renamed from: d  reason: collision with root package name */
    public static final zzl f3435d = new zzl(0, 30, 3600);

    /* renamed from: a  reason: collision with root package name */
    private final int f3436a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3437b = 30;

    /* renamed from: c  reason: collision with root package name */
    private final int f3438c = 3600;

    private zzl(int i, int i2, int i3) {
        this.f3436a = i;
    }

    public final Bundle a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f3436a);
        bundle.putInt("initial_backoff_seconds", this.f3437b);
        bundle.putInt("maximum_backoff_seconds", this.f3438c);
        return bundle;
    }

    public final int b() {
        return this.f3436a;
    }

    public final int c() {
        return this.f3437b;
    }

    public final int d() {
        return this.f3438c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzl = (zzl) obj;
        return zzl.f3436a == this.f3436a && zzl.f3437b == this.f3437b && zzl.f3438c == this.f3438c;
    }

    public final int hashCode() {
        return (((((this.f3436a + 1) ^ 1000003) * 1000003) ^ this.f3437b) * 1000003) ^ this.f3438c;
    }

    public final String toString() {
        int i = this.f3436a;
        int i2 = this.f3437b;
        int i3 = this.f3438c;
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
