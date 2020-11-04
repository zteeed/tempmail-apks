package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzsy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsy> CREATOR = new zztb();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f9099b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final long f9100c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f9101d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f9102e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final String f9103f;
    @SafeParcelable.Field
    private final Bundle g;
    @SafeParcelable.Field
    public final boolean h;
    @SafeParcelable.Field
    public long i;

    @SafeParcelable.Constructor
    zzsy(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j2) {
        this.f9099b = str;
        this.f9100c = j;
        this.f9101d = str2 == null ? "" : str2;
        this.f9102e = str3 == null ? "" : str3;
        this.f9103f = str4 == null ? "" : str4;
        this.g = bundle == null ? new Bundle() : bundle;
        this.h = z;
        this.i = j2;
    }

    public static zzsy u(String str) {
        return v(Uri.parse(str));
    }

    public static zzsy v(Uri uri) {
        long j;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzbba.i(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                j = 0;
            } else {
                j = Long.parseLong(queryParameter2);
            }
            long j2 = j;
            Bundle bundle = new Bundle();
            zzq.zzky();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzsy(queryParameter, j2, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            zzbba.d("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f9099b, false);
        SafeParcelWriter.o(parcel, 3, this.f9100c);
        SafeParcelWriter.t(parcel, 4, this.f9101d, false);
        SafeParcelWriter.t(parcel, 5, this.f9102e, false);
        SafeParcelWriter.t(parcel, 6, this.f9103f, false);
        SafeParcelWriter.e(parcel, 7, this.g, false);
        SafeParcelWriter.c(parcel, 8, this.h);
        SafeParcelWriter.o(parcel, 9, this.i);
        SafeParcelWriter.b(parcel, a2);
    }
}
