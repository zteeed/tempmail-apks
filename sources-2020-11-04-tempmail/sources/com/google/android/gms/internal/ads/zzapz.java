package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapz {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6032a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6033b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6034c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6035d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6036e;

    private zzapz(zzaqb zzaqb) {
        this.f6032a = zzaqb.f6047a;
        this.f6033b = zzaqb.f6048b;
        this.f6034c = zzaqb.f6049c;
        this.f6035d = zzaqb.f6050d;
        this.f6036e = zzaqb.f6051e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f6032a).put("tel", this.f6033b).put("calendar", this.f6034c).put("storePicture", this.f6035d).put("inlineVideo", this.f6036e);
        } catch (JSONException e2) {
            zzbba.c("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
