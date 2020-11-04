package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public static final Status f2898f = new Status(0);
    @KeepForSdk
    public static final Status g = new Status(8);
    @KeepForSdk
    public static final Status h = new Status(15);
    @KeepForSdk
    public static final Status i = new Status(16);
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2899b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f2900c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f2901d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f2902e;

    static {
        new Status(14);
        new Status(17);
        new Status(18);
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    Status(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.f2899b = i2;
        this.f2900c = i3;
        this.f2901d = str;
        this.f2902e = pendingIntent;
    }

    @VisibleForTesting
    public final boolean A() {
        return this.f2902e != null;
    }

    public final boolean B() {
        return this.f2900c <= 0;
    }

    public final void G(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (A()) {
            activity.startIntentSenderForResult(this.f2902e.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    public final String J() {
        String str = this.f2901d;
        if (str != null) {
            return str;
        }
        return CommonStatusCodes.a(this.f2900c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f2899b != status.f2899b || this.f2900c != status.f2900c || !Objects.a(this.f2901d, status.f2901d) || !Objects.a(this.f2902e, status.f2902e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f2899b), Integer.valueOf(this.f2900c), this.f2901d, this.f2902e);
    }

    @KeepForSdk
    public final Status q() {
        return this;
    }

    public final String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("statusCode", J());
        c2.a("resolution", this.f2902e);
        return c2.toString();
    }

    public final int u() {
        return this.f2900c;
    }

    public final String v() {
        return this.f2901d;
    }

    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, u());
        SafeParcelWriter.t(parcel, 2, v(), false);
        SafeParcelWriter.r(parcel, 3, this.f2902e, i2, false);
        SafeParcelWriter.l(parcel, 1000, this.f2899b);
        SafeParcelWriter.b(parcel, a2);
    }

    @KeepForSdk
    public Status(int i2) {
        this(i2, (String) null);
    }

    @KeepForSdk
    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    @KeepForSdk
    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }
}
