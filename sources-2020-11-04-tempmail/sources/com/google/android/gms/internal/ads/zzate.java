package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzate extends zzatf {

    /* renamed from: b  reason: collision with root package name */
    private final String f6129b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6130c;

    public zzate(String str, int i) {
        this.f6129b = str;
        this.f6130c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzate)) {
            zzate zzate = (zzate) obj;
            if (!Objects.a(this.f6129b, zzate.f6129b) || !Objects.a(Integer.valueOf(this.f6130c), Integer.valueOf(zzate.f6130c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.f6130c;
    }

    public final String getType() {
        return this.f6129b;
    }
}
