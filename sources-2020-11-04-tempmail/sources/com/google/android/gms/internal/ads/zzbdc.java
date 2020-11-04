package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdc {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6353a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6354b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6355c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6356d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6357e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6358f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;

    public zzbdc(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f6353a = a(jSONObject, "aggressive_media_codec_release", zzaav.z);
        this.f6354b = c(jSONObject, "byte_buffer_precache_limit", zzaav.h);
        this.f6355c = c(jSONObject, "exo_cache_buffer_size", zzaav.o);
        this.f6356d = c(jSONObject, "exo_connect_timeout_millis", zzaav.f5716d);
        d(jSONObject, "exo_player_version", zzaav.f5715c);
        this.f6357e = c(jSONObject, "exo_read_timeout_millis", zzaav.f5717e);
        this.f6358f = c(jSONObject, "load_check_interval_bytes", zzaav.f5718f);
        this.g = c(jSONObject, "player_precache_limit", zzaav.g);
        this.h = c(jSONObject, "socket_receive_buffer_size", zzaav.i);
        this.i = a(jSONObject, "use_cache_data_source", zzaav.O1);
        this.j = c(jSONObject, "min_retry_count", zzaav.k);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzaag<java.lang.Boolean>, com.google.android.gms.internal.ads.zzaag] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r3 = r0.c(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = b(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdc.a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaag):boolean");
    }

    private static boolean b(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaag<java.lang.Integer>, com.google.android.gms.internal.ads.zzaag] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaag<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r0.c(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdc.c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaag):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaag<java.lang.String>, com.google.android.gms.internal.ads.zzaag] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaag<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r0.c(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdc.d(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaag):java.lang.String");
    }
}
