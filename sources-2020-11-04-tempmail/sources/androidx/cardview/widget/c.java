package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;

/* compiled from: CardViewBaseImpl */
class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final RectF f1218a = new RectF();

    /* compiled from: CardViewBaseImpl */
    class a implements g.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f3 = 2.0f * f2;
            float width = (rectF.width() - f3) - 1.0f;
            float height = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                c.this.f1218a.set(f5, f5, f4, f4);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f4, rectF2.top + f4);
                Paint paint2 = paint;
                canvas.drawArc(c.this.f1218a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1218a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1218a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f1218a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f6 = rectF2.top;
                canvas.drawRect((rectF2.left + f4) - 1.0f, f6, (rectF2.right - f4) + 1.0f, f6 + f4, paint2);
                float f7 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f4) - 1.0f, f7 - f4, (rectF2.right - f4) + 1.0f, f7, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f2, rectF2.right, rectF2.bottom - f2, paint);
        }
    }

    c() {
    }

    private g p(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new g(context.getResources(), colorStateList, f2, f3, f4);
    }

    private g q(d dVar) {
        return (g) dVar.f();
    }

    public void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g p = p(context, colorStateList, f2, f3, f4);
        p.m(dVar.d());
        dVar.c(p);
        i(dVar);
    }

    public void b(d dVar, float f2) {
        q(dVar).p(f2);
        i(dVar);
    }

    public float c(d dVar) {
        return q(dVar).l();
    }

    public float d(d dVar) {
        return q(dVar).g();
    }

    public void e(d dVar) {
    }

    public void f(d dVar, float f2) {
        q(dVar).r(f2);
    }

    public float g(d dVar) {
        return q(dVar).i();
    }

    public ColorStateList h(d dVar) {
        return q(dVar).f();
    }

    public void i(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil((double) l(dVar)), (int) Math.ceil((double) k(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void j() {
        g.r = new a();
    }

    public float k(d dVar) {
        return q(dVar).j();
    }

    public float l(d dVar) {
        return q(dVar).k();
    }

    public void m(d dVar) {
        q(dVar).m(dVar.d());
        i(dVar);
    }

    public void n(d dVar, ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    public void o(d dVar, float f2) {
        q(dVar).q(f2);
        i(dVar);
    }
}
