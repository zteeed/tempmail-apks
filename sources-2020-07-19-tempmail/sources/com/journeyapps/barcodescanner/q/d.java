package com.journeyapps.barcodescanner.q;

/* compiled from: CameraSettings */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f12239a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12240b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12241c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12242d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12243e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12244f = false;
    private boolean g = false;
    private a h = a.AUTO;

    /* compiled from: CameraSettings */
    public enum a {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public a a() {
        return this.h;
    }

    public int b() {
        return this.f12239a;
    }

    public boolean c() {
        return this.f12243e;
    }

    public boolean d() {
        return this.g;
    }

    public boolean e() {
        return this.f12241c;
    }

    public boolean f() {
        return this.f12244f;
    }

    public boolean g() {
        return this.f12242d;
    }

    public boolean h() {
        return this.f12240b;
    }

    public void i(int i) {
        this.f12239a = i;
    }
}
