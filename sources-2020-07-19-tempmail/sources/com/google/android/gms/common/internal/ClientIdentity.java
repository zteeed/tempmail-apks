package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
public class ClientIdentity extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zab();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f2976b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f2977c;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        this.f2976b = i;
        this.f2977c = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f2976b == this.f2976b && Objects.a(clientIdentity.f2977c, this.f2977c);
        }
    }

    public int hashCode() {
        return this.f2976b;
    }

    public String toString() {
        int i = this.f2976b;
        String str = this.f2977c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2976b);
        SafeParcelWriter.t(parcel, 2, this.f2977c, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
