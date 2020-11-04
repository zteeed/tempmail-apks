package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvm();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f9377b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f9378c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f9379d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f9380e;

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j) {
        this.f9377b = i;
        this.f9378c = i2;
        this.f9379d = str;
        this.f9380e = j;
    }

    public static zzvj u(JSONObject jSONObject) throws JSONException {
        return new zzvj(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9377b);
        SafeParcelWriter.l(parcel, 2, this.f9378c);
        SafeParcelWriter.t(parcel, 3, this.f9379d, false);
        SafeParcelWriter.o(parcel, 4, this.f9380e);
        SafeParcelWriter.b(parcel, a2);
    }
}
