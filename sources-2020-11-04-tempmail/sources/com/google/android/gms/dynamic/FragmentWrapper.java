package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;

@SuppressLint({"NewApi"})
@KeepForSdk
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: b  reason: collision with root package name */
    private Fragment f3378b;

    private FragmentWrapper(Fragment fragment) {
        this.f3378b = fragment;
    }

    @KeepForSdk
    public static FragmentWrapper V(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean B3() {
        return this.f3378b.isInLayout();
    }

    public final void C(IObjectWrapper iObjectWrapper) {
        this.f3378b.registerForContextMenu((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean H0() {
        return this.f3378b.getUserVisibleHint();
    }

    public final void J0(boolean z) {
        this.f3378b.setUserVisibleHint(z);
    }

    public final boolean J1() {
        return this.f3378b.getRetainInstance();
    }

    public final IObjectWrapper L() {
        return ObjectWrapper.h0(this.f3378b.getResources());
    }

    public final IObjectWrapper Q() {
        return ObjectWrapper.h0(this.f3378b.getActivity());
    }

    public final void Q6(boolean z) {
        this.f3378b.setRetainInstance(z);
    }

    public final int R5() {
        return this.f3378b.getTargetRequestCode();
    }

    public final void U0(Intent intent) {
        this.f3378b.startActivity(intent);
    }

    public final IFragmentWrapper X() {
        return V(this.f3378b.getParentFragment());
    }

    public final void X0(boolean z) {
        this.f3378b.setMenuVisibility(z);
    }

    public final IFragmentWrapper Z1() {
        return V(this.f3378b.getTargetFragment());
    }

    public final String getTag() {
        return this.f3378b.getTag();
    }

    public final int h() {
        return this.f3378b.getId();
    }

    public final boolean isVisible() {
        return this.f3378b.isVisible();
    }

    public final Bundle k5() {
        return this.f3378b.getArguments();
    }

    public final boolean p0() {
        return this.f3378b.isHidden();
    }

    public final boolean q4() {
        return this.f3378b.isRemoving();
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f3378b.startActivityForResult(intent, i);
    }

    public final boolean t1() {
        return this.f3378b.isDetached();
    }

    public final boolean t4() {
        return this.f3378b.isResumed();
    }

    public final IObjectWrapper t6() {
        return ObjectWrapper.h0(this.f3378b.getView());
    }

    public final void v0(boolean z) {
        this.f3378b.setHasOptionsMenu(z);
    }

    public final boolean z4() {
        return this.f3378b.isAdded();
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.f3378b.unregisterForContextMenu((View) ObjectWrapper.V(iObjectWrapper));
    }
}
