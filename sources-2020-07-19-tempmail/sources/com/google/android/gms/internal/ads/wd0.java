package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wd0 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final int[] f5227b = new int[1];

    /* renamed from: c  reason: collision with root package name */
    private Handler f5228c;

    /* renamed from: d  reason: collision with root package name */
    private SurfaceTexture f5229d;

    /* renamed from: e  reason: collision with root package name */
    private Error f5230e;

    /* renamed from: f  reason: collision with root package name */
    private RuntimeException f5231f;
    private zzpv g;

    public wd0() {
        super("dummySurface");
    }

    public final void a() {
        this.f5228c.sendEmptyMessage(3);
    }

    public final zzpv b(boolean z) {
        boolean z2;
        start();
        this.f5228c = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f5228c.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.g == null && this.f5231f == null && this.f5230e == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f5231f;
        if (runtimeException == null) {
            Error error = this.f5230e;
            if (error == null) {
                return this.g;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                zzpb.f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                zzpb.f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                zzpb.f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                zzpb.f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                zzpb.f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                zzpb.f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f5227b, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5227b[0]);
                this.f5229d = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.g = new zzpv(this, this.f5229d, z);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f5231f = e2;
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f5230e = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.f5229d.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f5229d.release();
                this.g = null;
                this.f5229d = null;
                GLES20.glDeleteTextures(1, this.f5227b, 0);
                quit();
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } finally {
                    quit();
                }
            }
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5228c.sendEmptyMessage(2);
    }
}