package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3078b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Integer> f3079c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<String> f3080d;

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zaa> arrayList) {
        this.f3078b = i;
        this.f3079c = new HashMap<>();
        this.f3080d = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            u(zaa3.f3082c, zaa3.f3083d);
        }
    }

    public final /* synthetic */ Object h(Object obj) {
        String str = this.f3080d.get(((Integer) obj).intValue());
        return (str != null || !this.f3079c.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @KeepForSdk
    public final StringToIntConverter u(String str, int i) {
        this.f3079c.put(str, Integer.valueOf(i));
        this.f3080d.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3078b);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f3079c.keySet()) {
            arrayList.add(new zaa(next, this.f3079c.get(next).intValue()));
        }
        SafeParcelWriter.x(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Class
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();
        @SafeParcelable.VersionField

        /* renamed from: b  reason: collision with root package name */
        private final int f3081b;
        @SafeParcelable.Field

        /* renamed from: c  reason: collision with root package name */
        final String f3082c;
        @SafeParcelable.Field

        /* renamed from: d  reason: collision with root package name */
        final int f3083d;

        @SafeParcelable.Constructor
        zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
            this.f3081b = i;
            this.f3082c = str;
            this.f3083d = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = SafeParcelWriter.a(parcel);
            SafeParcelWriter.l(parcel, 1, this.f3081b);
            SafeParcelWriter.t(parcel, 2, this.f3082c, false);
            SafeParcelWriter.l(parcel, 3, this.f3083d);
            SafeParcelWriter.b(parcel, a2);
        }

        zaa(String str, int i) {
            this.f3081b = 1;
            this.f3082c = str;
            this.f3083d = i;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f3078b = 1;
        this.f3079c = new HashMap<>();
        this.f3080d = new SparseArray<>();
    }
}
