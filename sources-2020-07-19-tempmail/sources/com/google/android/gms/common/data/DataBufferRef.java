package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class DataBufferRef {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    protected final DataHolder f2930a;
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected int f2931b;

    /* renamed from: c  reason: collision with root package name */
    private int f2932c;

    /* access modifiers changed from: protected */
    public final void a(int i) {
        Preconditions.n(i >= 0 && i < this.f2930a.getCount());
        this.f2931b = i;
        this.f2932c = this.f2930a.G(i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (!Objects.a(Integer.valueOf(dataBufferRef.f2931b), Integer.valueOf(this.f2931b)) || !Objects.a(Integer.valueOf(dataBufferRef.f2932c), Integer.valueOf(this.f2932c)) || dataBufferRef.f2930a != this.f2930a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f2931b), Integer.valueOf(this.f2932c), this.f2930a);
    }
}
