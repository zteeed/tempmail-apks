package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaub> CREATOR = new zzaue();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f6144b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final int f6145c;

    public zzaub(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public static zzaub u(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaub(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaub)) {
            zzaub zzaub = (zzaub) obj;
            if (!Objects.a(this.f6144b, zzaub.f6144b) || !Objects.a(Integer.valueOf(this.f6145c), Integer.valueOf(zzaub.f6145c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f6144b, Integer.valueOf(this.f6145c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f6144b, false);
        SafeParcelWriter.l(parcel, 3, this.f6145c);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    public zzaub(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.f6144b = str;
        this.f6145c = i;
    }
}
