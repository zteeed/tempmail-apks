package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.a.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class a {
    private static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f11532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11533b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11534c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f11535d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11536e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11537f;

    public a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f11532a = str;
        this.f11533b = str2;
        this.f11534c = str3;
        this.f11535d = date;
        this.f11536e = j;
        this.f11537f = j2;
    }

    static a a(Map<String, String> map) throws AbtException {
        e(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        } catch (NumberFormatException e3) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e3);
        }
    }

    private static void e(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f11532a;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f11535d.getTime();
    }

    /* access modifiers changed from: package-private */
    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f11547a = str;
        cVar.m = c();
        cVar.f11548b = this.f11532a;
        cVar.f11549c = this.f11533b;
        cVar.f11550d = TextUtils.isEmpty(this.f11534c) ? null : this.f11534c;
        cVar.f11551e = this.f11536e;
        cVar.j = this.f11537f;
        return cVar;
    }
}
