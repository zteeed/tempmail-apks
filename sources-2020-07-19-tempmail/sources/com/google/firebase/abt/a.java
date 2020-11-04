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
    private final String f10980a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10981b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10982c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f10983d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10984e;

    /* renamed from: f  reason: collision with root package name */
    private final long f10985f;

    public a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f10980a = str;
        this.f10981b = str2;
        this.f10982c = str3;
        this.f10983d = date;
        this.f10984e = j;
        this.f10985f = j2;
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
        return this.f10980a;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f10983d.getTime();
    }

    /* access modifiers changed from: package-private */
    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f10995a = str;
        cVar.m = c();
        cVar.f10996b = this.f10980a;
        cVar.f10997c = this.f10981b;
        cVar.f10998d = TextUtils.isEmpty(this.f10982c) ? null : this.f10982c;
        cVar.f10999e = this.f10984e;
        cVar.j = this.f10985f;
        return cVar;
    }
}
