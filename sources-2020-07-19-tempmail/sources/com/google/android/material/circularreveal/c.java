package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealWidget */
public interface c extends b.a {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f10775b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f10776a = new e();

        /* renamed from: a */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f10776a.b(b.c.a.d.p.a.d(eVar.f10779a, eVar2.f10779a, f2), b.c.a.d.p.a.d(eVar.f10780b, eVar2.f10780b, f2), b.c.a.d.p.a.d(eVar.f10781c, eVar2.f10781c, f2));
            return this.f10776a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0096c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f10777a = new C0096c("circularReveal");

        private C0096c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f10778a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f10779a;

        /* renamed from: b  reason: collision with root package name */
        public float f10780b;

        /* renamed from: c  reason: collision with root package name */
        public float f10781c;

        public boolean a() {
            return this.f10781c == Float.MAX_VALUE;
        }

        public void b(float f2, float f3, float f4) {
            this.f10779a = f2;
            this.f10780b = f3;
            this.f10781c = f4;
        }

        public void c(e eVar) {
            b(eVar.f10779a, eVar.f10780b, eVar.f10781c);
        }

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.f10779a = f2;
            this.f10780b = f3;
            this.f10781c = f4;
        }

        public e(e eVar) {
            this(eVar.f10779a, eVar.f10780b, eVar.f10781c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
