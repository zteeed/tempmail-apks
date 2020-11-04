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
    private final int f3261b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Integer> f3262c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<String> f3263d;

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zaa> arrayList) {
        this.f3261b = i;
        this.f3262c = new HashMap<>();
        this.f3263d = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            u(zaa3.f3265c, zaa3.f3266d);
        }
    }

    public final /* synthetic */ Object h(Object obj) {
        String str = this.f3263d.get(((Integer) obj).intValue());
        return (str != null || !this.f3262c.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @KeepForSdk
    public final StringToIntConverter u(String str, int i) {
        this.f3262c.put(str, Integer.valueOf(i));
        this.f3263d.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3261b);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f3262c.keySet()) {
            arrayList.add(new zaa(next, this.f3262c.get(next).intValue()));
        }
        SafeParcelWriter.x(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Class
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();
        @SafeParcelable.VersionField

        /* renamed from: b  reason: collision with root package name */
        private final int f3264b;
        @SafeParcelable.Field

        /* renamed from: c  reason: collision with root package name */
        final String f3265c;
        @SafeParcelable.Field

        /* renamed from: d  reason: collision with root package name */
        final int f3266d;

        @SafeParcelable.Constructor
        zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
            this.f3264b = i;
            this.f3265c = str;
            this.f3266d = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = SafeParcelWriter.a(parcel);
            SafeParcelWriter.l(parcel, 1, this.f3264b);
            SafeParcelWriter.t(parcel, 2, this.f3265c, false);
            SafeParcelWriter.l(parcel, 3, this.f3266d);
            SafeParcelWriter.b(parcel, a2);
        }

        zaa(String str, int i) {
            this.f3264b = 1;
            this.f3265c = str;
            this.f3266d = i;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f3261b = 1;
        this.f3262c = new HashMap<>();
        this.f3263d = new SparseArray<>();
    }
}
