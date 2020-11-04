package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zae();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3139b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Uri f3140c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final int f3141d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final int f3142e;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.f3139b = i;
        this.f3140c = uri;
        this.f3141d = i2;
        this.f3142e = i3;
    }

    public final int A() {
        return this.f3141d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.a(this.f3140c, webImage.f3140c) && this.f3141d == webImage.f3141d && this.f3142e == webImage.f3142e;
        }
    }

    public final int hashCode() {
        return Objects.b(this.f3140c, Integer.valueOf(this.f3141d), Integer.valueOf(this.f3142e));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f3141d), Integer.valueOf(this.f3142e), this.f3140c.toString()});
    }

    public final int u() {
        return this.f3142e;
    }

    public final Uri v() {
        return this.f3140c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3139b);
        SafeParcelWriter.r(parcel, 2, v(), i, false);
        SafeParcelWriter.l(parcel, 3, A());
        SafeParcelWriter.l(parcel, 4, u());
        SafeParcelWriter.b(parcel, a2);
    }
}
