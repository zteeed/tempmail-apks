package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zan();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3096b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f3097c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f3098d;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.f3096b = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f3100c;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f3101d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f3101d.get(i3);
                hashMap2.put(zam.f3103c, zam.f3104d);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f3097c = hashMap;
        Preconditions.k(str);
        this.f3098d = str;
        u();
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> A(String str) {
        return this.f3097c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f3097c.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f3097c.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void u() {
        for (String str : this.f3097c.keySet()) {
            Map map = this.f3097c.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).A(this);
            }
        }
    }

    public final String v() {
        return this.f3098d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3096b);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f3097c.keySet()) {
            arrayList.add(new zal(next, this.f3097c.get(next)));
        }
        SafeParcelWriter.x(parcel, 2, arrayList, false);
        SafeParcelWriter.t(parcel, 3, this.f3098d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
