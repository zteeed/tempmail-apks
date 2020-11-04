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
    private Fragment f3199b;

    private SupportFragmentWrapper(Fragment fragment) {
        this.f3199b = fragment;
    }

    @KeepForSdk
    public static SupportFragmentWrapper P(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean A1() {
        return this.f3199b.b0();
    }

    public final boolean B0() {
        return this.f3199b.l0();
    }

    public final void D0(boolean z) {
        this.f3199b.a2(z);
    }

    public final IObjectWrapper H() {
        return ObjectWrapper.b0(this.f3199b.a0());
    }

    public final IObjectWrapper L() {
        return ObjectWrapper.b0(this.f3199b.u());
    }

    public final void N0(Intent intent) {
        this.f3199b.c2(intent);
    }

    public final void Q0(boolean z) {
        this.f3199b.S1(z);
    }

    public final IFragmentWrapper Q1() {
        return P(this.f3199b.j0());
    }

    public final Bundle Q4() {
        return this.f3199b.D();
    }

    public final IFragmentWrapper R() {
        return P(this.f3199b.Y());
    }

    public final IObjectWrapper T5() {
        return ObjectWrapper.b0(this.f3199b.m0());
    }

    public final boolean W3() {
        return this.f3199b.x0();
    }

    public final boolean Z3() {
        return this.f3199b.y0();
    }

    public final boolean f4() {
        return this.f3199b.q0();
    }

    public final int g() {
        return this.f3199b.O();
    }

    public final String getTag() {
        return this.f3199b.i0();
    }

    public final boolean isVisible() {
        return this.f3199b.B0();
    }

    public final boolean j0() {
        return this.f3199b.s0();
    }

    public final boolean l3() {
        return this.f3199b.v0();
    }

    public final boolean n1() {
        return this.f3199b.r0();
    }

    public final void o6(boolean z) {
        this.f3199b.X1(z);
    }

    public final void p0(boolean z) {
        this.f3199b.P1(z);
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f3199b.startActivityForResult(intent, i);
    }

    public final int v5() {
        return this.f3199b.k0();
    }

    public final void z(IObjectWrapper iObjectWrapper) {
        this.f3199b.H1((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.f3199b.g2((View) ObjectWrapper.P(iObjectWrapper));
    }
}
