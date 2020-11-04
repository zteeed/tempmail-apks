package com.google.zxing.y.e;

import com.google.zxing.y.c.h;
import com.google.zxing.y.c.j;

/* compiled from: QRCode */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private h f12126a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.zxing.y.c.f f12127b;

    /* renamed from: c  reason: collision with root package name */
    private j f12128c;

    /* renamed from: d  reason: collision with root package name */
    private int f12129d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f12130e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public b a() {
        return this.f12130e;
    }

    public void c(com.google.zxing.y.c.f fVar) {
        this.f12127b = fVar;
    }

    public void d(int i) {
        this.f12129d = i;
    }

    public void e(b bVar) {
        this.f12130e = bVar;
    }

    public void f(h hVar) {
        this.f12126a = hVar;
    }

    public void g(j jVar) {
        this.f12128c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f12126a);
        sb.append("\n ecLevel: ");
        sb.append(this.f12127b);
        sb.append("\n version: ");
        sb.append(this.f12128c);
        sb.append("\n maskPattern: ");
        sb.append(this.f12129d);
        if (this.f12130e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f12130e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
