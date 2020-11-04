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
    private h f10899b;

    /* renamed from: c  reason: collision with root package name */
    private BottomNavigationMenuView f10900c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10901d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f10902e;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f10903b;

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
            parcel.writeInt(this.f10903b);
        }

        SavedState(Parcel parcel) {
            this.f10903b = parcel.readInt();
        }
    }

    public void a(h hVar, boolean z) {
    }

    public void b(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f10900c = bottomNavigationMenuView;
    }

    public void c(int i) {
        this.f10902e = i;
    }

    public void d(boolean z) {
        this.f10901d = z;
    }

    public int h() {
        return this.f10902e;
    }

    public void i(boolean z) {
        if (!this.f10901d) {
            if (z) {
                this.f10900c.d();
            } else {
                this.f10900c.i();
            }
        }
    }

    public boolean j() {
        return false;
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public boolean l(h hVar, j jVar) {
        return false;
    }

    public void m(o.a aVar) {
    }

    public void n(Context context, h hVar) {
        this.f10899b = hVar;
        this.f10900c.b(hVar);
    }

    public void o(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f10900c.h(((SavedState) parcelable).f10903b);
        }
    }

    public boolean p(u uVar) {
        return false;
    }

    public Parcelable q() {
        SavedState savedState = new SavedState();
        savedState.f10903b = this.f10900c.getSelectedItemId();
        return savedState;
    }
}
