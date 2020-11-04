package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zap();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3274b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Parcel f3275c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3276d = 2;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final zak f3277e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3278f;
    private int g;
    private int h;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zak zak) {
        this.f3274b = i;
        Preconditions.k(parcel);
        this.f3275c = parcel;
        this.f3277e = zak;
        if (zak == null) {
            this.f3278f = null;
        } else {
            this.f3278f = zak.v();
        }
        this.g = 2;
    }

    private static void e(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private final void f(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).u(), next);
        }
        sb.append('{');
        int L = SafeParcelReader.L(parcel);
        boolean z = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.v(C));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.G()) {
                    switch (field.f3272e) {
                        case 0:
                            g(sb, field, FastJsonResponse.d(field, Integer.valueOf(SafeParcelReader.E(parcel, C))));
                            break;
                        case 1:
                            g(sb, field, FastJsonResponse.d(field, SafeParcelReader.c(parcel, C)));
                            break;
                        case 2:
                            g(sb, field, FastJsonResponse.d(field, Long.valueOf(SafeParcelReader.G(parcel, C))));
                            break;
                        case 3:
                            g(sb, field, FastJsonResponse.d(field, Float.valueOf(SafeParcelReader.A(parcel, C))));
                            break;
                        case 4:
                            g(sb, field, FastJsonResponse.d(field, Double.valueOf(SafeParcelReader.y(parcel, C))));
                            break;
                        case 5:
                            g(sb, field, FastJsonResponse.d(field, SafeParcelReader.a(parcel, C)));
                            break;
                        case 6:
                            g(sb, field, FastJsonResponse.d(field, Boolean.valueOf(SafeParcelReader.w(parcel, C))));
                            break;
                        case 7:
                            g(sb, field, FastJsonResponse.d(field, SafeParcelReader.p(parcel, C)));
                            break;
                        case 8:
                        case 9:
                            g(sb, field, FastJsonResponse.d(field, SafeParcelReader.g(parcel, C)));
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.f(parcel, C);
                            HashMap hashMap = new HashMap();
                            for (String str : f2.keySet()) {
                                hashMap.put(str, f2.getString(str));
                            }
                            g(sb, field, FastJsonResponse.d(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f3272e;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f3273f) {
                    sb.append("[");
                    switch (field.f3272e) {
                        case 0:
                            ArrayUtils.e(sb, SafeParcelReader.j(parcel, C));
                            break;
                        case 1:
                            ArrayUtils.g(sb, SafeParcelReader.d(parcel, C));
                            break;
                        case 2:
                            ArrayUtils.f(sb, SafeParcelReader.l(parcel, C));
                            break;
                        case 3:
                            ArrayUtils.d(sb, SafeParcelReader.i(parcel, C));
                            break;
                        case 4:
                            ArrayUtils.c(sb, SafeParcelReader.h(parcel, C));
                            break;
                        case 5:
                            ArrayUtils.g(sb, SafeParcelReader.b(parcel, C));
                            break;
                        case 6:
                            ArrayUtils.h(sb, SafeParcelReader.e(parcel, C));
                            break;
                        case 7:
                            ArrayUtils.i(sb, SafeParcelReader.q(parcel, C));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = SafeParcelReader.n(parcel, C);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                n[i2].setDataPosition(0);
                                f(sb, field.K(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f3272e) {
                        case 0:
                            sb.append(SafeParcelReader.E(parcel, C));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.c(parcel, C));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.G(parcel, C));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.A(parcel, C));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.y(parcel, C));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, C));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.w(parcel, C));
                            break;
                        case 7:
                            String p = SafeParcelReader.p(parcel, C);
                            sb.append("\"");
                            sb.append(JsonUtils.a(p));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g2 = SafeParcelReader.g(parcel, C);
                            sb.append("\"");
                            sb.append(Base64Utils.a(g2));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g3 = SafeParcelReader.g(parcel, C);
                            sb.append("\"");
                            sb.append(Base64Utils.b(g3));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f3 = SafeParcelReader.f(parcel, C);
                            Set<String> keySet = f3.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(JsonUtils.a(f3.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = SafeParcelReader.m(parcel, C);
                            m.setDataPosition(0);
                            f(sb, field.K(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == L) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(L);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    private final void g(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f3271d) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                e(sb, field.f3270c, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        e(sb, field.f3270c, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel h() {
        /*
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f3275c
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.a(r0)
            r2.h = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f3275c
            int r1 = r2.h
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.b(r0, r1)
            r0 = 2
            r2.g = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f3275c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.h():android.os.Parcel");
    }

    public Map<String, FastJsonResponse.Field<?, ?>> a() {
        zak zak = this.f3277e;
        if (zak == null) {
            return null;
        }
        return zak.A(this.f3278f);
    }

    public boolean c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        Preconditions.l(this.f3277e, "Cannot convert to JSON on client side.");
        Parcel h2 = h();
        h2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        f(sb, this.f3277e.A(this.f3278f), h2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f3274b);
        SafeParcelWriter.q(parcel, 2, h(), false);
        int i2 = this.f3276d;
        if (i2 == 0) {
            zak = null;
        } else if (i2 == 1) {
            zak = this.f3277e;
        } else if (i2 == 2) {
            zak = this.f3277e;
        } else {
            int i3 = this.f3276d;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        SafeParcelWriter.r(parcel, 3, zak, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
