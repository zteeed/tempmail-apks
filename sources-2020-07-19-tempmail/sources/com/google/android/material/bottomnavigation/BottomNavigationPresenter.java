package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.u;

public class BottomNavigationPresenter implements o {

    /* renamed from: b  reason: collision with root package name */
    private h f10713b;

    /* renamed from: c  reason: collision with root package name */
    private BottomNavigationMenuView f10714c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10715d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f10716e;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f10717b;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10717b);
        }

        SavedState(Parcel parcel) {
            this.f10717b = parcel.readInt();
        }
    }

    public void a(h hVar, boolean z) {
    }

    public void b(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f10714c = bottomNavigationMenuView;
    }

    public void c(int i) {
        this.f10716e = i;
    }

    public void d(boolean z) {
        this.f10715d = z;
    }

    public int g() {
        return this.f10716e;
    }

    public void h(boolean z) {
        if (!this.f10715d) {
            if (z) {
                this.f10714c.d();
            } else {
                this.f10714c.i();
            }
        }
    }

    public boolean i() {
        return false;
    }

    public boolean j(h hVar, j jVar) {
        return false;
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public void l(o.a aVar) {
    }

    public void m(Context context, h hVar) {
        this.f10713b = hVar;
        this.f10714c.b(hVar);
    }

    public void n(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f10714c.h(((SavedState) parcelable).f10717b);
        }
    }

    public boolean o(u uVar) {
        return false;
    }

    public Parcelable p() {
        SavedState savedState = new SavedState();
        savedState.f10717b = this.f10714c.getSelectedItemId();
        return savedState;
    }
}
