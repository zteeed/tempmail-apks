package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzwf extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9213a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private AdListener f9214b;

    public final void a(AdListener adListener) {
        synchronized (this.f9213a) {
            this.f9214b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f9213a) {
            if (this.f9214b != null) {
                this.f9214b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f9213a) {
            if (this.f9214b != null) {
                this.f9214b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f9213a) {
            if (this.f9214b != null) {
                this.f9214b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f9213a) {
            if (this.f9214b != null) {
                this.f9214b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f9213a) {
            if (this.f9214b != null) {
                this.f9214b.onAdOpened();
            }
        }
    }
}
