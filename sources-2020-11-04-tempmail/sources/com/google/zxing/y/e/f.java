package com.google.zxing.y.e;

import com.google.zxing.y.c.h;
import com.google.zxing.y.c.j;

/* compiled from: QRCode */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private h f12675a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.zxing.y.c.f f12676b;

    /* renamed from: c  reason: collision with root package name */
    private j f12677c;

    /* renamed from: d  reason: collision with root package name */
    private int f12678d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f12679e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public b a() {
        return this.f12679e;
    }

    public void c(com.google.zxing.y.c.f fVar) {
        this.f12676b = fVar;
    }

    public void d(int i) {
        this.f12678d = i;
    }

    public void e(b bVar) {
        this.f12679e = bVar;
    }

    public void f(h hVar) {
        this.f12675a = hVar;
    }

    public void g(j jVar) {
        this.f12677c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f12675a);
        sb.append("\n ecLevel: ");
        sb.append(this.f12676b);
        sb.append("\n version: ");
        sb.append(this.f12677c);
        sb.append("\n maskPattern: ");
        sb.append(this.f12678d);
        if (this.f12679e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f12679e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
