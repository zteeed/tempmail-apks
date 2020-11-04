package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzwf extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9396a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private AdListener f9397b;

    public final void a(AdListener adListener) {
        synchronized (this.f9396a) {
            this.f9397b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f9396a) {
            if (this.f9397b != null) {
                this.f9397b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f9396a) {
            if (this.f9397b != null) {
                this.f9397b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f9396a) {
            if (this.f9397b != null) {
                this.f9397b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f9396a) {
            if (this.f9397b != null) {
                this.f9397b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f9396a) {
            if (this.f9397b != null) {
                this.f9397b.onAdOpened();
            }
        }
    }
}
