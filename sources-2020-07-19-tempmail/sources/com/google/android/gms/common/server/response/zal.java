package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3099b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final String f3100c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    final ArrayList<zam> f3101d;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) ArrayList<zam> arrayList) {
        this.f3099b = i;
        this.f3100c = str;
        this.f3101d = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3099b);
        SafeParcelWriter.t(parcel, 2, this.f3100c, false);
        SafeParcelWriter.x(parcel, 3, this.f3101d, false);
        SafeParcelWriter.b(parcel, a2);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f3099b = 1;
        this.f3100c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f3101d = arrayList;
    }
}
