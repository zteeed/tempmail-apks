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
    private final int f3164b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f3165c;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        this.f3164b = i;
        this.f3165c = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f3164b == this.f3164b && Objects.a(clientIdentity.f3165c, this.f3165c);
        }
    }

    public int hashCode() {
        return this.f3164b;
    }

    public String toString() {
        int i = this.f3164b;
        String str = this.f3165c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3164b);
        SafeParcelWriter.t(parcel, 2, this.f3165c, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
