package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3084b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final StringToIntConverter f3085c;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) StringToIntConverter stringToIntConverter) {
        this.f3084b = i;
        this.f3085c = stringToIntConverter;
    }

    public static zaa u(FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.FieldConverter<?, ?> v() {
        StringToIntConverter stringToIntConverter = this.f3085c;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3084b);
        SafeParcelWriter.r(parcel, 2, this.f3085c, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f3084b = 1;
        this.f3085c = stringToIntConverter;
    }
}
