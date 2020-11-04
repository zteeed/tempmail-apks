package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11635a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11636b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11637c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11638d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11639e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11640f;
    private final String g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.o(!Strings.a(str), "ApplicationId must be set.");
        this.f11636b = str;
        this.f11635a = str2;
        this.f11637c = str3;
        this.f11638d = str4;
        this.f11639e = str5;
        this.f11640f = str6;
        this.g = str7;
    }

    public static d a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a2 = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new d(a2, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public String b() {
        return this.f11635a;
    }

    public String c() {
        return this.f11636b;
    }

    public String d() {
        return this.f11639e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Objects.a(this.f11636b, dVar.f11636b) || !Objects.a(this.f11635a, dVar.f11635a) || !Objects.a(this.f11637c, dVar.f11637c) || !Objects.a(this.f11638d, dVar.f11638d) || !Objects.a(this.f11639e, dVar.f11639e) || !Objects.a(this.f11640f, dVar.f11640f) || !Objects.a(this.g, dVar.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.b(this.f11636b, this.f11635a, this.f11637c, this.f11638d, this.f11639e, this.f11640f, this.g);
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("applicationId", this.f11636b);
        c2.a("apiKey", this.f11635a);
        c2.a("databaseUrl", this.f11637c);
        c2.a("gcmSenderId", this.f11639e);
        c2.a("storageBucket", this.f11640f);
        c2.a("projectId", this.g);
        return c2.toString();
    }
}
