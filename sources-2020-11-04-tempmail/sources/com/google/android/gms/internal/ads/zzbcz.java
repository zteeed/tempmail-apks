package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbcz extends Thread implements SurfaceTexture.OnFrameAvailableListener, q7 {
    private static final float[] C = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean A;
    private volatile boolean B;

    /* renamed from: b  reason: collision with root package name */
    private final p7 f6347b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f6348c = new float[9];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f6349d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    private final float[] f6350e = new float[9];

    /* renamed from: f  reason: collision with root package name */
    private final float[] f6351f = new float[9];
    private final float[] g = new float[9];
    private final float[] h = new float[9];
    private final float[] i = new float[9];
    private float j = Float.NaN;
    private float k;
    private float l;
    private int m;
    private int n;
    private SurfaceTexture o;
    private SurfaceTexture p;
    private int q;
    private int r;
    private int s;
    private FloatBuffer t;
    private final CountDownLatch u;
    private final Object v;
    private EGL10 w;
    private EGLDisplay x;
    private EGLContext y;
    private EGLSurface z;

    public zzbcz(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(C.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.t = asFloatBuffer;
        asFloatBuffer.put(C).position(0);
        p7 p7Var = new p7(context);
        this.f6347b = p7Var;
        p7Var.c(this);
        this.u = new CountDownLatch(1);
        this.v = new Object();
    }

    private static void c(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = (double) f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void f(float[] fArr, float f2) {
        double d2 = (double) f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int g(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        h("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        h("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        h("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        h("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i2);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        h("deleteShader");
        return 0;
    }

    private static void h(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    @VisibleForTesting
    private final boolean l() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.z;
        boolean z2 = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z2 = this.w.eglDestroySurface(this.x, this.z) | this.w.eglMakeCurrent(this.x, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.z = null;
        }
        EGLContext eGLContext = this.y;
        if (eGLContext != null) {
            z2 |= this.w.eglDestroyContext(this.x, eGLContext);
            this.y = null;
        }
        EGLDisplay eGLDisplay = this.x;
        if (eGLDisplay == null) {
            return z2;
        }
        boolean eglTerminate = z2 | this.w.eglTerminate(eGLDisplay);
        this.x = null;
        return eglTerminate;
    }

    public final void a() {
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    public final void b(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.n = i2;
        this.m = i3;
        this.p = surfaceTexture;
    }

    public final void e(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int i2 = this.n;
        int i3 = this.m;
        if (i2 > i3) {
            f5 = (f2 * 1.7453293f) / ((float) i2);
            f4 = f3 * 1.7453293f;
            f6 = (float) i2;
        } else {
            f5 = (f2 * 1.7453293f) / ((float) i3);
            f4 = f3 * 1.7453293f;
            f6 = (float) i3;
        }
        this.k -= f5;
        float f7 = this.l - (f4 / f6);
        this.l = f7;
        if (f7 < -1.5707964f) {
            this.l = -1.5707964f;
        }
        if (this.l > 1.5707964f) {
            this.l = 1.5707964f;
        }
    }

    public final void i(int i2, int i3) {
        synchronized (this.v) {
            this.n = i2;
            this.m = i3;
            this.A = true;
            this.v.notifyAll();
        }
    }

    public final void j() {
        synchronized (this.v) {
            this.B = true;
            this.p = null;
            this.v.notifyAll();
        }
    }

    public final SurfaceTexture k() {
        if (this.p == null) {
            return null;
        }
        try {
            this.u.await();
        } catch (InterruptedException unused) {
        }
        return this.o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.s++;
        synchronized (this.v) {
            this.v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.zzbba.g(r0)
            java.util.concurrent.CountDownLatch r0 = r14.u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.w = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.x = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002b
        L_0x0028:
            r0 = 0
            goto L_0x0092
        L_0x002b:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r14.w
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x0036
            goto L_0x0028
        L_0x0036:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0055
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0055
            r0 = r1[r6]
            goto L_0x0056
        L_0x0055:
            r0 = r4
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x0028
        L_0x0059:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.w
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.y = r1
            if (r1 == 0) goto L_0x0028
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0071
            goto L_0x0028
        L_0x0071:
            javax.microedition.khronos.egl.EGL10 r1 = r14.w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.x
            android.graphics.SurfaceTexture r8 = r14.p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.z = r0
            if (r0 == 0) goto L_0x0028
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0084
            goto L_0x0028
        L_0x0084:
            javax.microedition.khronos.egl.EGL10 r1 = r14.w
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.x
            javax.microedition.khronos.egl.EGLContext r8 = r14.y
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0091
            goto L_0x0028
        L_0x0091:
            r0 = 1
        L_0x0092:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.zzaag<java.lang.String> r7 = com.google.android.gms.internal.ads.zzaav.B0
            com.google.android.gms.internal.ads.zzaar r8 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r8 = r8.c(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.m()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzaar r8 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r7 = r8.c(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00b8:
            int r1 = g(r1, r7)
            if (r1 != 0) goto L_0x00c1
        L_0x00be:
            r8 = 0
            goto L_0x0143
        L_0x00c1:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.zzaag<java.lang.String> r8 = com.google.android.gms.internal.ads.zzaav.C0
            com.google.android.gms.internal.ads.zzaar r9 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r9 = r9.c(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.m()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzaar r9 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r8 = r9.c(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00e7:
            int r7 = g(r7, r8)
            if (r7 != 0) goto L_0x00ee
            goto L_0x00be
        L_0x00ee:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            h(r9)
            if (r8 == 0) goto L_0x0143
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            h(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            h(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            h(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            h(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x013b
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            h(r1)
            goto L_0x00be
        L_0x013b:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            h(r1)
        L_0x0143:
            r14.q = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            h(r1)
            int r1 = r14.q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            h(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            h(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            h(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            h(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            h(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            h(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            h(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            h(r7)
            int r7 = r14.q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.r = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r14.q
            if (r7 == 0) goto L_0x01cc
            r7 = 1
            goto L_0x01cd
        L_0x01cc:
            r7 = 0
        L_0x01cd:
            if (r0 == 0) goto L_0x038c
            if (r7 != 0) goto L_0x01d3
            goto L_0x038c
        L_0x01d3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.o = r0
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.u
            r0.countDown()
            com.google.android.gms.internal.ads.p7 r0 = r14.f6347b
            r0.a()
            r14.A = r5     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x01e9:
            boolean r0 = r14.B     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 != 0) goto L_0x0337
        L_0x01ed:
            int r0 = r14.s     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 <= 0) goto L_0x01fc
            android.graphics.SurfaceTexture r0 = r14.o     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.s     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r0 - r5
            r14.s = r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x01ed
        L_0x01fc:
            com.google.android.gms.internal.ads.p7 r0 = r14.f6347b     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r1 = r14.f6348c     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = r0.d(r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r1 = 5
            r7 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x0282
            float r0 = r14.j     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 == 0) goto L_0x0277
            float[] r0 = r14.f6348c     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 - r8
            float r0 = -r0
            r14.j = r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x0277:
            float[] r0 = r14.h     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r14.j     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r10 = r14.k     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r9 + r10
            f(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x0291
        L_0x0282:
            float[] r0 = r14.f6348c     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            c(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.h     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r14.k     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            f(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x0291:
            float[] r0 = r14.f6349d     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            c(r0, r8)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f6350e     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.h     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f6349d     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            d(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f6351f     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.f6348c     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f6350e     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            d(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r8 = r14.l     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            c(r0, r8)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.i     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f6351f     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            d(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.r     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.i     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r0 = "drawArrays"
            h(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGL10 r0 = r14.w     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.x     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.z     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = r14.A     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 == 0) goto L_0x031d
            int r0 = r14.n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r1 = r14.m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r0 = "viewport"
            h(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r1 = r14.q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r7 = r14.n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r8 = r14.m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x030c
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 * r9
            int r7 = r14.n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x031b
        L_0x030c:
            int r7 = r14.n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = r7 * r9
            int r8 = r14.m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x031b:
            r14.A = r6     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x031d:
            java.lang.Object r0 = r14.v     // Catch:{ InterruptedException -> 0x01e9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01e9 }
            boolean r1 = r14.B     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            boolean r1 = r14.A     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            int r1 = r14.s     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            java.lang.Object r1 = r14.v     // Catch:{ all -> 0x0334 }
            r1.wait()     // Catch:{ all -> 0x0334 }
        L_0x0331:
            monitor-exit(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x01e9
        L_0x0334:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0334 }
            throw r1     // Catch:{ InterruptedException -> 0x01e9 }
        L_0x0337:
            com.google.android.gms.internal.ads.p7 r0 = r14.f6347b
            r0.b()
            android.graphics.SurfaceTexture r0 = r14.o
            r0.setOnFrameAvailableListener(r4)
            r14.o = r4
            r14.l()
            return
        L_0x0347:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.zzbba.c(r1, r0)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.zzaxh r1 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x037b }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.e(r0, r2)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.p7 r0 = r14.f6347b
            r0.b()
            android.graphics.SurfaceTexture r0 = r14.o
            r0.setOnFrameAvailableListener(r4)
            r14.o = r4
            r14.l()
            return
        L_0x0366:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.p7 r0 = r14.f6347b
            r0.b()
            android.graphics.SurfaceTexture r0 = r14.o
            r0.setOnFrameAvailableListener(r4)
            r14.o = r4
            r14.l()
            return
        L_0x037b:
            r0 = move-exception
            com.google.android.gms.internal.ads.p7 r1 = r14.f6347b
            r1.b()
            android.graphics.SurfaceTexture r1 = r14.o
            r1.setOnFrameAvailableListener(r4)
            r14.o = r4
            r14.l()
            throw r0
        L_0x038c:
            javax.microedition.khronos.egl.EGL10 r0 = r14.w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03a7
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03ac
        L_0x03a7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03ac:
            com.google.android.gms.internal.ads.zzbba.g(r0)
            com.google.android.gms.internal.ads.zzaxh r1 = com.google.android.gms.ads.internal.zzq.zzla()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.e(r2, r0)
            r14.l()
            java.util.concurrent.CountDownLatch r0 = r14.u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcz.run():void");
    }
}
