package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.o;
import com.google.zxing.s.a.f;
import com.google.zxing.s.a.k;
import com.journeyapps.barcodescanner.CameraPreview;
import java.util.ArrayList;
import java.util.List;

public class ViewfinderView extends View {
    protected static final int[] n = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b  reason: collision with root package name */
    protected final Paint f12155b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    protected Bitmap f12156c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f12157d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f12158e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f12159f;
    protected final int g;
    protected int h;
    protected List<o> i;
    protected List<o> j;
    protected CameraPreview k;
    protected Rect l;
    protected Rect m;

    class a implements CameraPreview.f {
        a() {
        }

        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }

        public void b(Exception exc) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    static {
        Class<ViewfinderView> cls = ViewfinderView.class;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.zxing_finder);
        this.f12157d = obtainStyledAttributes.getColor(k.zxing_finder_zxing_viewfinder_mask, resources.getColor(f.zxing_viewfinder_mask));
        this.f12158e = obtainStyledAttributes.getColor(k.zxing_finder_zxing_result_view, resources.getColor(f.zxing_result_view));
        this.f12159f = obtainStyledAttributes.getColor(k.zxing_finder_zxing_viewfinder_laser, resources.getColor(f.zxing_viewfinder_laser));
        this.g = obtainStyledAttributes.getColor(k.zxing_finder_zxing_possible_result_points, resources.getColor(f.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.h = 0;
        this.i = new ArrayList(20);
        this.j = new ArrayList(20);
    }

    public void a(o oVar) {
        if (this.i.size() < 20) {
            this.i.add(oVar);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        CameraPreview cameraPreview = this.k;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            Rect previewFramingRect = this.k.getPreviewFramingRect();
            if (framingRect != null && previewFramingRect != null) {
                this.l = framingRect;
                this.m = previewFramingRect;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Rect rect;
        b();
        Rect rect2 = this.l;
        if (rect2 != null && (rect = this.m) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f12155b.setColor(this.f12156c != null ? this.f12158e : this.f12157d);
            float f2 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f2, (float) rect2.top, this.f12155b);
            canvas.drawRect(0.0f, (float) rect2.top, (float) rect2.left, (float) (rect2.bottom + 1), this.f12155b);
            float f3 = f2;
            canvas.drawRect((float) (rect2.right + 1), (float) rect2.top, f3, (float) (rect2.bottom + 1), this.f12155b);
            canvas.drawRect(0.0f, (float) (rect2.bottom + 1), f3, (float) height, this.f12155b);
            if (this.f12156c != null) {
                this.f12155b.setAlpha(160);
                canvas.drawBitmap(this.f12156c, (Rect) null, rect2, this.f12155b);
                return;
            }
            this.f12155b.setColor(this.f12159f);
            this.f12155b.setAlpha(n[this.h]);
            this.h = (this.h + 1) % n.length;
            int height2 = (rect2.height() / 2) + rect2.top;
            canvas.drawRect((float) (rect2.left + 2), (float) (height2 - 1), (float) (rect2.right - 1), (float) (height2 + 2), this.f12155b);
            float width2 = ((float) rect2.width()) / ((float) rect.width());
            float height3 = ((float) rect2.height()) / ((float) rect.height());
            int i2 = rect2.left;
            int i3 = rect2.top;
            if (!this.j.isEmpty()) {
                this.f12155b.setAlpha(80);
                this.f12155b.setColor(this.g);
                for (o next : this.j) {
                    canvas.drawCircle((float) (((int) (next.c() * width2)) + i2), (float) (((int) (next.d() * height3)) + i3), 3.0f, this.f12155b);
                }
                this.j.clear();
            }
            if (!this.i.isEmpty()) {
                this.f12155b.setAlpha(160);
                this.f12155b.setColor(this.g);
                for (o next2 : this.i) {
                    canvas.drawCircle((float) (((int) (next2.c() * width2)) + i2), (float) (((int) (next2.d() * height3)) + i3), 6.0f, this.f12155b);
                }
                List<o> list = this.i;
                List<o> list2 = this.j;
                this.i = list2;
                this.j = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.k = cameraPreview;
        cameraPreview.i(new a());
    }
}
