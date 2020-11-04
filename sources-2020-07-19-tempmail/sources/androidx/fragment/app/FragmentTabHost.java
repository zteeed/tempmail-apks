package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f1461b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f1462c;

    /* renamed from: d  reason: collision with root package name */
    private Context f1463d;

    /* renamed from: e  reason: collision with root package name */
    private g f1464e;

    /* renamed from: f  reason: collision with root package name */
    private int f1465f;
    private TabHost.OnTabChangeListener g;
    private a h;
    private boolean i;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        String f1466b;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f1466b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1466b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1466b = parcel.readString();
        }
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String f1467a;

        /* renamed from: b  reason: collision with root package name */
        final Class<?> f1468b;

        /* renamed from: c  reason: collision with root package name */
        final Bundle f1469c;

        /* renamed from: d  reason: collision with root package name */
        Fragment f1470d;
    }

    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        e(context, (AttributeSet) null);
    }

    private j a(String str, j jVar) {
        Fragment fragment;
        a d2 = d(str);
        if (this.h != d2) {
            if (jVar == null) {
                jVar = this.f1464e.b();
            }
            a aVar = this.h;
            if (!(aVar == null || (fragment = aVar.f1470d) == null)) {
                jVar.h(fragment);
            }
            if (d2 != null) {
                Fragment fragment2 = d2.f1470d;
                if (fragment2 == null) {
                    Fragment o0 = Fragment.o0(this.f1463d, d2.f1468b.getName(), d2.f1469c);
                    d2.f1470d = o0;
                    jVar.b(this.f1465f, o0, d2.f1467a);
                } else {
                    jVar.e(fragment2);
                }
            }
            this.h = d2;
        }
        return jVar;
    }

    private void b() {
        if (this.f1462c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f1465f);
            this.f1462c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f1465f);
            }
        }
    }

    private void c(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f1462c = frameLayout2;
            frameLayout2.setId(this.f1465f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    private a d(String str) {
        int size = this.f1461b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f1461b.get(i2);
            if (aVar.f1467a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f1465f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1461b.size();
        j jVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f1461b.get(i2);
            Fragment f2 = this.f1464e.f(aVar.f1467a);
            aVar.f1470d = f2;
            if (f2 != null && !f2.r0()) {
                if (aVar.f1467a.equals(currentTabTag)) {
                    this.h = aVar;
                } else {
                    if (jVar == null) {
                        jVar = this.f1464e.b();
                    }
                    jVar.h(aVar.f1470d);
                }
            }
        }
        this.i = true;
        j a2 = a(currentTabTag, jVar);
        if (a2 != null) {
            a2.f();
            this.f1464e.d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f1466b);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1466b = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        j a2;
        if (this.i && (a2 = a(str, (j) null)) != null) {
            a2.f();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.g = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, g gVar) {
        c(context);
        super.setup();
        this.f1463d = context;
        this.f1464e = gVar;
        b();
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public void setup(Context context, g gVar, int i2) {
        c(context);
        super.setup();
        this.f1463d = context;
        this.f1464e = gVar;
        this.f1465f = i2;
        b();
        this.f1462c.setId(i2);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
