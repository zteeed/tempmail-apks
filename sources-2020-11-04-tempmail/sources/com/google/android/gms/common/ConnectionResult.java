package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();
    @KeepForSdk

    /* renamed from: f  reason: collision with root package name */
    public static final ConnectionResult f2841f = new ConnectionResult(0);
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2842b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f2843c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f2844d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f2845e;

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) String str) {
        this.f2842b = i;
        this.f2843c = i2;
        this.f2844d = pendingIntent;
        this.f2845e = str;
    }

    static String J(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final PendingIntent A() {
        return this.f2844d;
    }

    public final boolean B() {
        return (this.f2843c == 0 || this.f2844d == null) ? false : true;
    }

    public final boolean G() {
        return this.f2843c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f2843c == connectionResult.f2843c && Objects.a(this.f2844d, connectionResult.f2844d) && Objects.a(this.f2845e, connectionResult.f2845e);
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f2843c), this.f2844d, this.f2845e);
    }

    public final String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("statusCode", J(this.f2843c));
        c2.a("resolution", this.f2844d);
        c2.a("message", this.f2845e);
        return c2.toString();
    }

    public final int u() {
        return this.f2843c;
    }

    public final String v() {
        return this.f2845e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2842b);
        SafeParcelWriter.l(parcel, 2, u());
        SafeParcelWriter.r(parcel, 3, A(), i, false);
        SafeParcelWriter.t(parcel, 4, v(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
