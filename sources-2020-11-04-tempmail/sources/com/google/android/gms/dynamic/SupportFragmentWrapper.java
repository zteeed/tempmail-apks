package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: b  reason: collision with root package name */
    private Fragment f3382b;

    private SupportFragmentWrapper(Fragment fragment) {
        this.f3382b = fragment;
    }

    @KeepForSdk
    public static SupportFragmentWrapper V(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean B3() {
        return this.f3382b.y0();
    }

    public final void C(IObjectWrapper iObjectWrapper) {
        this.f3382b.M1((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean H0() {
        return this.f3382b.o0();
    }

    public final void J0(boolean z) {
        this.f3382b.g2(z);
    }

    public final boolean J1() {
        return this.f3382b.f0();
    }

    public final IObjectWrapper L() {
        return ObjectWrapper.h0(this.f3382b.e0());
    }

    public final IObjectWrapper Q() {
        return ObjectWrapper.h0(this.f3382b.z());
    }

    public final void Q6(boolean z) {
        this.f3382b.c2(z);
    }

    public final int R5() {
        return this.f3382b.n0();
    }

    public final void U0(Intent intent) {
        this.f3382b.i2(intent);
    }

    public final IFragmentWrapper X() {
        return V(this.f3382b.a0());
    }

    public final void X0(boolean z) {
        this.f3382b.Y1(z);
    }

    public final IFragmentWrapper Z1() {
        return V(this.f3382b.m0());
    }

    public final String getTag() {
        return this.f3382b.l0();
    }

    public final int h() {
        return this.f3382b.U();
    }

    public final boolean isVisible() {
        return this.f3382b.E0();
    }

    public final Bundle k5() {
        return this.f3382b.J();
    }

    public final boolean p0() {
        return this.f3382b.v0();
    }

    public final boolean q4() {
        return this.f3382b.A0();
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f3382b.startActivityForResult(intent, i);
    }

    public final boolean t1() {
        return this.f3382b.u0();
    }

    public final boolean t4() {
        return this.f3382b.C0();
    }

    public final IObjectWrapper t6() {
        return ObjectWrapper.h0(this.f3382b.p0());
    }

    public final void v0(boolean z) {
        this.f3382b.W1(z);
    }

    public final boolean z4() {
        return this.f3382b.t0();
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.f3382b.m2((View) ObjectWrapper.V(iObjectWrapper));
    }
}
