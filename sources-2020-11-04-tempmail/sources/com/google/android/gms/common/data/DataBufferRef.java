package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class DataBufferRef {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    protected final DataHolder f3118a;
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected int f3119b;

    /* renamed from: c  reason: collision with root package name */
    private int f3120c;

    /* access modifiers changed from: protected */
    public final void a(int i) {
        Preconditions.n(i >= 0 && i < this.f3118a.getCount());
        this.f3119b = i;
        this.f3120c = this.f3118a.G(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (!Objects.a(Integer.valueOf(dataBufferRef.f3119b), Integer.valueOf(this.f3119b)) || !Objects.a(Integer.valueOf(dataBufferRef.f3120c), Integer.valueOf(this.f3120c)) || dataBufferRef.f3118a != this.f3118a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f3119b), Integer.valueOf(this.f3120c), this.f3118a);
    }
}
