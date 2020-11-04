package com.google.android.material.stateful;

import a.e.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public final g<String, Bundle> f10890d;

    static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        a() {
        }

        /* renamed from: a */
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (a) null);
        }

        /* renamed from: b */
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (a) null);
        }

        /* renamed from: c */
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f10890d + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f10890d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f10890d.i(i2);
            bundleArr[i2] = this.f10890d.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f10890d = new g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f10890d = new g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f10890d.put(strArr[i], bundleArr[i]);
        }
    }
}
