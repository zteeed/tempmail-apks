package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.s.a.g;
import com.google.zxing.s.a.k;
import com.journeyapps.barcodescanner.q.h;
import com.journeyapps.barcodescanner.q.i;
import com.journeyapps.barcodescanner.q.j;
import com.journeyapps.barcodescanner.q.l;
import java.util.ArrayList;
import java.util.List;

public class CameraPreview extends ViewGroup {
    /* access modifiers changed from: private */
    public static final String B = CameraPreview.class.getSimpleName();
    /* access modifiers changed from: private */
    public final f A = new e();

    /* renamed from: b  reason: collision with root package name */
    private com.journeyapps.barcodescanner.q.b f12136b;

    /* renamed from: c  reason: collision with root package name */
    private WindowManager f12137c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f12138d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12139e = false;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceView f12140f;
    private TextureView g;
    private boolean h = false;
    private m i;
    private int j = -1;
    /* access modifiers changed from: private */
    public List<f> k = new ArrayList();
    private h l;
    private com.journeyapps.barcodescanner.q.d m = new com.journeyapps.barcodescanner.q.d();
    private n n;
    private n o;
    private Rect p;
    /* access modifiers changed from: private */
    public n q;
    private Rect r = null;
    private Rect s = null;
    private n t = null;
    private double u = 0.1d;
    private l v = null;
    private boolean w = false;
    private final SurfaceHolder.Callback x = new b();
    private final Handler.Callback y = new c();
    private l z = new d();

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            n unused = CameraPreview.this.q = new n(i, i2);
            CameraPreview.this.C();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class b implements SurfaceHolder.Callback {
        b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(CameraPreview.B, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            n unused = CameraPreview.this.q = new n(i2, i3);
            CameraPreview.this.C();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            n unused = CameraPreview.this.q = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == g.zxing_prewiew_size_ready) {
                CameraPreview.this.w((n) message.obj);
                return true;
            } else if (i == g.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.r()) {
                    return false;
                }
                CameraPreview.this.u();
                CameraPreview.this.A.b(exc);
                return false;
            } else if (i != g.zxing_camera_closed) {
                return false;
            } else {
                CameraPreview.this.A.d();
                return false;
            }
        }
    }

    class d implements l {

        class a implements Runnable {
            a() {
            }

            public void run() {
                CameraPreview.this.z();
            }
        }

        d() {
        }

        public void a(int i) {
            CameraPreview.this.f12138d.postDelayed(new a(), 250);
        }
    }

    class e implements f {
        e() {
        }

        public void a() {
            for (f a2 : CameraPreview.this.k) {
                a2.a();
            }
        }

        public void b(Exception exc) {
            for (f b2 : CameraPreview.this.k) {
                b2.b(exc);
            }
        }

        public void c() {
            for (f c2 : CameraPreview.this.k) {
                c2.c();
            }
        }

        public void d() {
            for (f d2 : CameraPreview.this.k) {
                d2.d();
            }
        }

        public void e() {
            for (f e2 : CameraPreview.this.k) {
                e2.e();
            }
        }
    }

    public interface f {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    public CameraPreview(Context context) {
        super(context);
        p(context, (AttributeSet) null, 0, 0);
    }

    private void A() {
        if (this.f12139e) {
            TextureView textureView = new TextureView(getContext());
            this.g = textureView;
            textureView.setSurfaceTextureListener(D());
            addView(this.g);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f12140f = surfaceView;
        surfaceView.getHolder().addCallback(this.x);
        addView(this.f12140f);
    }

    private void B(com.journeyapps.barcodescanner.q.e eVar) {
        if (!this.h && this.f12136b != null) {
            Log.i(B, "Starting preview");
            this.f12136b.u(eVar);
            this.f12136b.w();
            this.h = true;
            x();
            this.A.e();
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        Rect rect;
        n nVar = this.q;
        if (nVar != null && this.o != null && (rect = this.p) != null) {
            if (this.f12140f == null || !nVar.equals(new n(rect.width(), this.p.height()))) {
                TextureView textureView = this.g;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.o != null) {
                        this.g.setTransform(l(new n(this.g.getWidth(), this.g.getHeight()), this.o));
                    }
                    B(new com.journeyapps.barcodescanner.q.e(this.g.getSurfaceTexture()));
                    return;
                }
                return;
            }
            B(new com.journeyapps.barcodescanner.q.e(this.f12140f.getHolder()));
        }
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener D() {
        return new a();
    }

    private int getDisplayRotation() {
        return this.f12137c.getDefaultDisplay().getRotation();
    }

    private void j() {
        n nVar;
        h hVar;
        n nVar2 = this.n;
        if (nVar2 == null || (nVar = this.o) == null || (hVar = this.l) == null) {
            this.s = null;
            this.r = null;
            this.p = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i2 = nVar.f12198b;
        int i3 = nVar.f12199c;
        int i4 = nVar2.f12198b;
        int i5 = nVar2.f12199c;
        this.p = hVar.d(nVar);
        this.r = k(new Rect(0, 0, i4, i5), this.p);
        Rect rect = new Rect(this.r);
        Rect rect2 = this.p;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i2) / this.p.width(), (rect.top * i3) / this.p.height(), (rect.right * i2) / this.p.width(), (rect.bottom * i3) / this.p.height());
        this.s = rect3;
        if (rect3.width() <= 0 || this.s.height() <= 0) {
            this.s = null;
            this.r = null;
            Log.w(B, "Preview frame is too small");
            return;
        }
        this.A.a();
    }

    private void m(n nVar) {
        this.n = nVar;
        com.journeyapps.barcodescanner.q.b bVar = this.f12136b;
        if (bVar != null && bVar.l() == null) {
            h hVar = new h(getDisplayRotation(), nVar);
            this.l = hVar;
            hVar.e(getPreviewScalingStrategy());
            this.f12136b.s(this.l);
            this.f12136b.k();
            boolean z2 = this.w;
            if (z2) {
                this.f12136b.v(z2);
            }
        }
    }

    private void o() {
        if (this.f12136b != null) {
            Log.w(B, "initCamera called twice");
            return;
        }
        com.journeyapps.barcodescanner.q.b n2 = n();
        this.f12136b = n2;
        n2.t(this.f12138d);
        this.f12136b.p();
        this.j = getDisplayRotation();
    }

    private void p(Context context, AttributeSet attributeSet, int i2, int i3) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f12137c = (WindowManager) context.getSystemService("window");
        this.f12138d = new Handler(this.y);
        this.i = new m();
    }

    /* access modifiers changed from: private */
    public void w(n nVar) {
        this.o = nVar;
        if (this.n != null) {
            j();
            requestLayout();
            C();
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        if (r() && getDisplayRotation() != this.j) {
            u();
            y();
        }
    }

    public com.journeyapps.barcodescanner.q.b getCameraInstance() {
        return this.f12136b;
    }

    public com.journeyapps.barcodescanner.q.d getCameraSettings() {
        return this.m;
    }

    public Rect getFramingRect() {
        return this.r;
    }

    public n getFramingRectSize() {
        return this.t;
    }

    public double getMarginFraction() {
        return this.u;
    }

    public Rect getPreviewFramingRect() {
        return this.s;
    }

    public l getPreviewScalingStrategy() {
        l lVar = this.v;
        if (lVar != null) {
            return lVar;
        }
        if (this.g != null) {
            return new com.journeyapps.barcodescanner.q.g();
        }
        return new i();
    }

    public void i(f fVar) {
        this.k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.t != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.t.f12198b) / 2), Math.max(0, (rect3.height() - this.t.f12199c) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.u, ((double) rect3.height()) * this.u);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    public Matrix l(n nVar, n nVar2) {
        float f2;
        float f3 = ((float) nVar.f12198b) / ((float) nVar.f12199c);
        float f4 = ((float) nVar2.f12198b) / ((float) nVar2.f12199c);
        float f5 = 1.0f;
        if (f3 < f4) {
            f5 = f4 / f3;
            f2 = 1.0f;
        } else {
            f2 = f3 / f4;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f2);
        int i2 = nVar.f12198b;
        int i3 = nVar.f12199c;
        matrix.postTranslate((((float) i2) - (((float) i2) * f5)) / 2.0f, (((float) i3) - (((float) i3) * f2)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: protected */
    public com.journeyapps.barcodescanner.q.b n() {
        com.journeyapps.barcodescanner.q.b bVar = new com.journeyapps.barcodescanner.q.b(getContext());
        bVar.r(this.m);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        m(new n(i4 - i2, i5 - i3));
        SurfaceView surfaceView = this.f12140f;
        if (surfaceView != null) {
            Rect rect = this.p;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.g;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.w);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void q(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(k.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(k.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.t = new n(dimension, dimension2);
        }
        this.f12139e = obtainStyledAttributes.getBoolean(k.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(k.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.v = new com.journeyapps.barcodescanner.q.g();
        } else if (integer == 2) {
            this.v = new i();
        } else if (integer == 3) {
            this.v = new j();
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return this.f12136b != null;
    }

    public boolean s() {
        com.journeyapps.barcodescanner.q.b bVar = this.f12136b;
        return bVar == null || bVar.n();
    }

    public void setCameraSettings(com.journeyapps.barcodescanner.q.d dVar) {
        this.m = dVar;
    }

    public void setFramingRectSize(n nVar) {
        this.t = nVar;
    }

    public void setMarginFraction(double d2) {
        if (d2 < 0.5d) {
            this.u = d2;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(l lVar) {
        this.v = lVar;
    }

    public void setTorch(boolean z2) {
        this.w = z2;
        com.journeyapps.barcodescanner.q.b bVar = this.f12136b;
        if (bVar != null) {
            bVar.v(z2);
        }
    }

    public void setUseTextureView(boolean z2) {
        this.f12139e = z2;
    }

    public boolean t() {
        return this.h;
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        p.a();
        Log.d(B, "pause()");
        this.j = -1;
        com.journeyapps.barcodescanner.q.b bVar = this.f12136b;
        if (bVar != null) {
            bVar.j();
            this.f12136b = null;
            this.h = false;
        } else {
            this.f12138d.sendEmptyMessage(g.zxing_camera_closed);
        }
        if (this.q == null && (surfaceView = this.f12140f) != null) {
            surfaceView.getHolder().removeCallback(this.x);
        }
        if (this.q == null && (textureView = this.g) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.n = null;
        this.o = null;
        this.s = null;
        this.i.f();
        this.A.c();
    }

    public void v() {
        com.journeyapps.barcodescanner.q.b cameraInstance = getCameraInstance();
        u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.n() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    public void y() {
        p.a();
        Log.d(B, "resume()");
        o();
        if (this.q != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f12140f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.x);
            } else {
                TextureView textureView = this.g;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.g.getSurfaceTexture(), this.g.getWidth(), this.g.getHeight());
                    } else {
                        this.g.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.i.e(getContext(), this.z);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p(context, attributeSet, i2, 0);
    }
}
