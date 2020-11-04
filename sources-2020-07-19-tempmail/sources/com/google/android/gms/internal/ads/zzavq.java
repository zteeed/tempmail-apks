package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzavq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavq> CREATOR = new zzavp();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f5991b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f5992c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5993d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5994e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5995f;
    @SafeParcelable.Field
    public final boolean g;
    @SafeParcelable.Field
    public final boolean h;
    @SafeParcelable.Field
    public final List<String> i;

    @SafeParcelable.Constructor
    public zzavq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List<String> list2) {
        this.f5991b = str;
        this.f5992c = str2;
        this.f5993d = z;
        this.f5994e = z2;
        this.f5995f = list;
        this.g = z3;
        this.h = z4;
        this.i = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzavq u(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzavq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzazy.c(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzazy.c(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f5991b, false);
        SafeParcelWriter.t(parcel, 3, this.f5992c, false);
        SafeParcelWriter.c(parcel, 4, this.f5993d);
        SafeParcelWriter.c(parcel, 5, this.f5994e);
        SafeParcelWriter.v(parcel, 6, this.f5995f, false);
        SafeParcelWriter.c(parcel, 7, this.g);
        SafeParcelWriter.c(parcel, 8, this.h);
        SafeParcelWriter.v(parcel, 9, this.i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
