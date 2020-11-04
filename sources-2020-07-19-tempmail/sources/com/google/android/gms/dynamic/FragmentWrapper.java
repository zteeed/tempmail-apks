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
    private Fragment f3195b;

    private FragmentWrapper(Fragment fragment) {
        this.f3195b = fragment;
    }

    @KeepForSdk
    public static FragmentWrapper P(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean A1() {
        return this.f3195b.getRetainInstance();
    }

    public final boolean B0() {
        return this.f3195b.getUserVisibleHint();
    }

    public final void D0(boolean z) {
        this.f3195b.setUserVisibleHint(z);
    }

    public final IObjectWrapper H() {
        return ObjectWrapper.b0(this.f3195b.getResources());
    }

    public final IObjectWrapper L() {
        return ObjectWrapper.b0(this.f3195b.getActivity());
    }

    public final void N0(Intent intent) {
        this.f3195b.startActivity(intent);
    }

    public final void Q0(boolean z) {
        this.f3195b.setMenuVisibility(z);
    }

    public final IFragmentWrapper Q1() {
        return P(this.f3195b.getTargetFragment());
    }

    public final Bundle Q4() {
        return this.f3195b.getArguments();
    }

    public final IFragmentWrapper R() {
        return P(this.f3195b.getParentFragment());
    }

    public final IObjectWrapper T5() {
        return ObjectWrapper.b0(this.f3195b.getView());
    }

    public final boolean W3() {
        return this.f3195b.isRemoving();
    }

    public final boolean Z3() {
        return this.f3195b.isResumed();
    }

    public final boolean f4() {
        return this.f3195b.isAdded();
    }

    public final int g() {
        return this.f3195b.getId();
    }

    public final String getTag() {
        return this.f3195b.getTag();
    }

    public final boolean isVisible() {
        return this.f3195b.isVisible();
    }

    public final boolean j0() {
        return this.f3195b.isHidden();
    }

    public final boolean l3() {
        return this.f3195b.isInLayout();
    }

    public final boolean n1() {
        return this.f3195b.isDetached();
    }

    public final void o6(boolean z) {
        this.f3195b.setRetainInstance(z);
    }

    public final void p0(boolean z) {
        this.f3195b.setHasOptionsMenu(z);
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f3195b.startActivityForResult(intent, i);
    }

    public final int v5() {
        return this.f3195b.getTargetRequestCode();
    }

    public final void z(IObjectWrapper iObjectWrapper) {
        this.f3195b.registerForContextMenu((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.f3195b.unregisterForContextMenu((View) ObjectWrapper.P(iObjectWrapper));
    }
}
