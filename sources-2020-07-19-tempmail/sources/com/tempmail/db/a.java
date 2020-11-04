package com.tempmail.db;

import android.webkit.MimeTypeMap;
import com.tempmail.utils.m;
import java.io.Serializable;

/* compiled from: AttachmentInfoTable */
public class a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private Long f12279b;

    /* renamed from: c  reason: collision with root package name */
    private String f12280c;

    /* renamed from: d  reason: collision with root package name */
    private String f12281d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f12282e;

    /* renamed from: f  reason: collision with root package name */
    private Long f12283f;
    private String g;
    private String h;

    public a(String str, String str2, Integer num, Long l, String str3, String str4) {
        this.f12280c = str;
        this.f12281d = str2;
        this.f12282e = num;
        this.f12283f = l;
        this.g = str3;
        this.h = str4;
    }

    public Integer a() {
        return this.f12282e;
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.f12280c;
    }

    public String d() {
        return this.f12281d;
    }

    public Long e() {
        return this.f12279b;
    }

    public String f() {
        return c() + " " + a();
    }

    public String g() {
        return this.g;
    }

    public Long h() {
        return this.f12283f;
    }

    public String i() {
        String simpleName = a.class.getSimpleName();
        m.b(simpleName, "attachmentInfoTable mime type " + g());
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(g());
        String d2 = d();
        m.b(simpleName, "fileName " + d2);
        m.b(simpleName, "extension " + extensionFromMimeType);
        if (extensionFromMimeType == null || d2.contains(extensionFromMimeType)) {
            return d2;
        }
        String str = d2 + "." + extensionFromMimeType;
        m.b(simpleName, "fileName updated" + str);
        return str;
    }

    public void j(Long l) {
        this.f12279b = l;
    }

    public a() {
    }

    public a(Long l, String str, String str2, Integer num, Long l2, String str3, String str4) {
        this.f12279b = l;
        this.f12280c = str;
        this.f12281d = str2;
        this.f12282e = num;
        this.f12283f = l2;
        this.g = str3;
        this.h = str4;
    }
}
