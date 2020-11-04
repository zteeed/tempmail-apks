package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapz {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5849a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5850b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5851c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5852d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5853e;

    private zzapz(zzaqb zzaqb) {
        this.f5849a = zzaqb.f5864a;
        this.f5850b = zzaqb.f5865b;
        this.f5851c = zzaqb.f5866c;
        this.f5852d = zzaqb.f5867d;
        this.f5853e = zzaqb.f5868e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f5849a).put("tel", this.f5850b).put("calendar", this.f5851c).put("storePicture", this.f5852d).put("inlineVideo", this.f5853e);
        } catch (JSONException e2) {
            zzbba.c("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
