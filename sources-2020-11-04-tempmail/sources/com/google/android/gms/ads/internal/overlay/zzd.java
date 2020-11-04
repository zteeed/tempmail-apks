package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zza();
    @SafeParcelable.Field
    public final Intent intent;
    @SafeParcelable.Field
    public final String mimeType;
    @SafeParcelable.Field
    public final String packageName;
    @SafeParcelable.Field
    public final String url;
    @SafeParcelable.Field
    private final String zzdns;
    @SafeParcelable.Field
    public final String zzdnt;
    @SafeParcelable.Field
    public final String zzdnu;
    @SafeParcelable.Field
    private final String zzdnv;

    public zzd(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.zzdns, false);
        SafeParcelWriter.t(parcel, 3, this.url, false);
        SafeParcelWriter.t(parcel, 4, this.mimeType, false);
        SafeParcelWriter.t(parcel, 5, this.packageName, false);
        SafeParcelWriter.t(parcel, 6, this.zzdnt, false);
        SafeParcelWriter.t(parcel, 7, this.zzdnu, false);
        SafeParcelWriter.t(parcel, 8, this.zzdnv, false);
        SafeParcelWriter.r(parcel, 9, this.intent, i, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zzd(Intent intent2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent2);
    }

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) Intent intent2) {
        this.zzdns = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdnt = str5;
        this.zzdnu = str6;
        this.zzdnv = str7;
        this.intent = intent2;
    }
}
