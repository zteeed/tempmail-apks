package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* compiled from: RotationListener */
public class m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f12193a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f12194b;

    /* renamed from: c  reason: collision with root package name */
    private OrientationEventListener f12195c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l f12196d;

    /* compiled from: RotationListener */
    class a extends OrientationEventListener {
        a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager a2 = m.this.f12194b;
            l b2 = m.this.f12196d;
            if (m.this.f12194b != null && b2 != null && (rotation = a2.getDefaultDisplay().getRotation()) != m.this.f12193a) {
                int unused = m.this.f12193a = rotation;
                b2.a(rotation);
            }
        }
    }

    public void e(Context context, l lVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f12196d = lVar;
        this.f12194b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f12195c = aVar;
        aVar.enable();
        this.f12193a = this.f12194b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f12195c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f12195c = null;
        this.f12194b = null;
        this.f12196d = null;
    }
}
