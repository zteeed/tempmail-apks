package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcd implements zzdec<zzdce> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7851a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdla f7852b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageInfo f7853c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxx f7854d;

    public zzdcd(zzdvi zzdvi, zzdla zzdla, PackageInfo packageInfo, zzaxx zzaxx) {
        this.f7851a = zzdvi;
        this.f7852b = zzdla;
        this.f7853c = packageInfo;
        this.f7854d = zzaxx;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r9 == 3) goto L_0x011a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            java.util.ArrayList<java.lang.String> r9 = r9.h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.zzaav.x1
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r9 = r0.c(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzadj r9 = r9.i
            int r9 = r9.f5634b
            if (r9 <= r1) goto L_0x0061
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzadj r9 = r9.i
            int r9 = r9.i
            if (r9 == r6) goto L_0x0055
            if (r9 == r5) goto L_0x0053
            if (r9 == r1) goto L_0x0051
            r7 = 4
            if (r9 == r7) goto L_0x004e
            r9 = r4
            goto L_0x0056
        L_0x004e:
            java.lang.String r9 = "square"
            goto L_0x0056
        L_0x0051:
            r9 = r2
            goto L_0x0056
        L_0x0053:
            r9 = r0
            goto L_0x0056
        L_0x0055:
            r9 = r3
        L_0x0056:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x0061:
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzadj r9 = r9.i
            int r9 = r9.f5636d
            if (r9 == 0) goto L_0x0071
            if (r9 == r6) goto L_0x006f
            if (r9 == r5) goto L_0x0072
            r0 = r4
            goto L_0x0072
        L_0x006f:
            r0 = r2
            goto L_0x0072
        L_0x0071:
            r0 = r3
        L_0x0072:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x007d:
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzadj r9 = r9.i
            boolean r9 = r9.f5637e
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzadj r9 = r9.i
            boolean r9 = r9.h
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f7853c
            if (r9 != 0) goto L_0x0099
            r9 = 0
            goto L_0x009b
        L_0x0099:
            int r9 = r9.versionCode
        L_0x009b:
            com.google.android.gms.internal.ads.zzaxx r0 = r8.f7854d
            int r0 = r0.g()
            if (r9 <= r0) goto L_0x00ad
            com.google.android.gms.internal.ads.zzaxx r0 = r8.f7854d
            r0.z()
            com.google.android.gms.internal.ads.zzaxx r0 = r8.f7854d
            r0.p(r9)
        L_0x00ad:
            com.google.android.gms.internal.ads.zzaxx r9 = r8.f7854d
            org.json.JSONObject r9 = r9.D()
            if (r9 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzdla r0 = r8.f7852b
            java.lang.String r0 = r0.f8168f
            org.json.JSONArray r9 = r9.optJSONArray(r0)
            if (r9 == 0) goto L_0x00c4
            java.lang.String r9 = r9.toString()
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "native_advanced_settings"
            r10.putString(r0, r9)
        L_0x00d0:
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            int r9 = r9.k
            if (r9 <= r6) goto L_0x00db
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00db:
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzaio r9 = r9.f8165c
            if (r9 == 0) goto L_0x012c
            java.lang.String r0 = r9.f5731d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0120
            int r0 = r9.f5729b
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00f8
            int r9 = r9.f5732e
            if (r9 == r5) goto L_0x0119
            if (r9 == r1) goto L_0x011a
            goto L_0x0119
        L_0x00f8:
            int r9 = r9.f5730c
            if (r9 == r6) goto L_0x0119
            if (r9 == r5) goto L_0x011a
            r0 = 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Instream ad video aspect ratio "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = " is wrong."
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzbba.g(r9)
        L_0x0119:
            r2 = r3
        L_0x011a:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0127
        L_0x0120:
            java.lang.String r9 = r9.f5731d
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0127:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x012c:
            com.google.android.gms.internal.ads.zzdla r9 = r8.f7852b
            com.google.android.gms.internal.ads.zzafn r9 = r9.a()
            if (r9 == 0) goto L_0x0139
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdcd.a(java.util.ArrayList, android.os.Bundle):void");
    }

    public final zzdvf<zzdce> b() {
        return this.f7851a.f(new ms(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdce c() throws Exception {
        ArrayList<String> arrayList = this.f7852b.g;
        if (arrayList == null) {
            return ls.f4324a;
        }
        if (arrayList.isEmpty()) {
            return os.f4581a;
        }
        return new ns(this, arrayList);
    }
}
