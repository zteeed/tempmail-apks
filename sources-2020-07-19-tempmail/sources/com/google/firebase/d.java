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
    private final String f11085a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11086b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11087c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11088d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11089e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11090f;
    private final String g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.o(!Strings.a(str), "ApplicationId must be set.");
        this.f11086b = str;
        this.f11085a = str2;
        this.f11087c = str3;
        this.f11088d = str4;
        this.f11089e = str5;
        this.f11090f = str6;
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
        return this.f11085a;
    }

    public String c() {
        return this.f11086b;
    }

    public String d() {
        return this.f11089e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Objects.a(this.f11086b, dVar.f11086b) || !Objects.a(this.f11085a, dVar.f11085a) || !Objects.a(this.f11087c, dVar.f11087c) || !Objects.a(this.f11088d, dVar.f11088d) || !Objects.a(this.f11089e, dVar.f11089e) || !Objects.a(this.f11090f, dVar.f11090f) || !Objects.a(this.g, dVar.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.b(this.f11086b, this.f11085a, this.f11087c, this.f11088d, this.f11089e, this.f11090f, this.g);
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("applicationId", this.f11086b);
        c2.a("apiKey", this.f11085a);
        c2.a("databaseUrl", this.f11087c);
        c2.a("gcmSenderId", this.f11089e);
        c2.a("storageBucket", this.f11090f);
        c2.a("projectId", this.g);
        return c2.toString();
    }
}
