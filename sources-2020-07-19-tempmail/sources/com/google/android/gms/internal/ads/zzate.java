package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzate extends zzatf {

    /* renamed from: b  reason: collision with root package name */
    private final String f5946b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5947c;

    public zzate(String str, int i) {
        this.f5946b = str;
        this.f5947c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzate)) {
            zzate zzate = (zzate) obj;
            if (!Objects.a(this.f5946b, zzate.f5946b) || !Objects.a(Integer.valueOf(this.f5947c), Integer.valueOf(zzate.f5947c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.f5947c;
    }

    public final String getType() {
        return this.f5946b;
    }
}
