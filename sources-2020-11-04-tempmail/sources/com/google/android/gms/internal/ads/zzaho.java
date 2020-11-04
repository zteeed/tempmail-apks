package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaho extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaho> CREATOR = new zzahr();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f5892b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String[] f5893c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String[] f5894d;

    @SafeParcelable.Constructor
    zzaho(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.f5892b = str;
        this.f5893c = strArr;
        this.f5894d = strArr2;
    }

    public static zzaho u(zzaa<?> zzaa) throws zzl {
        Map<String, String> f2 = zzaa.f();
        int size = f2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : f2.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzaho(zzaa.h(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, this.f5892b, false);
        SafeParcelWriter.u(parcel, 2, this.f5893c, false);
        SafeParcelWriter.u(parcel, 3, this.f5894d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
