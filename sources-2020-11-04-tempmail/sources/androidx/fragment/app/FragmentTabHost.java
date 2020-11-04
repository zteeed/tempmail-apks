package androidx.fragment.app;

import android.annotation.SuppressLint;
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

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f1495b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f1496c;

    /* renamed from: d  reason: collision with root package name */
    private Context f1497d;

    /* renamed from: e  reason: collision with root package name */
    private k f1498e;

    /* renamed from: f  reason: collision with root package name */
    private int f1499f;
    private TabHost.OnTabChangeListener g;
    private a h;
    private boolean i;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        String f1500b;

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
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f1500b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1500b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1500b = parcel.readString();
        }
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String f1501a;

        /* renamed from: b  reason: collision with root package name */
        final Class<?> f1502b;

        /* renamed from: c  reason: collision with root package name */
        final Bundle f1503c;

        /* renamed from: d  reason: collision with root package name */
        Fragment f1504d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        e(context, (AttributeSet) null);
    }

    private q a(String str, q qVar) {
        Fragment fragment;
        a d2 = d(str);
        if (this.h != d2) {
            if (qVar == null) {
                qVar = this.f1498e.j();
            }
            a aVar = this.h;
            if (!(aVar == null || (fragment = aVar.f1504d) == null)) {
                qVar.k(fragment);
            }
            if (d2 != null) {
                Fragment fragment2 = d2.f1504d;
                if (fragment2 == null) {
                    Fragment a2 = this.f1498e.g0().a(this.f1497d.getClassLoader(), d2.f1502b.getName());
                    d2.f1504d = a2;
                    a2.V1(d2.f1503c);
                    qVar.b(this.f1499f, d2.f1504d, d2.f1501a);
                } else {
                    qVar.g(fragment2);
                }
            }
            this.h = d2;
        }
        return qVar;
    }

    private void b() {
        if (this.f1496c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f1499f);
            this.f1496c = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f1499f);
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
            this.f1496c = frameLayout2;
            frameLayout2.setId(this.f1499f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    private a d(String str) {
        int size = this.f1495b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f1495b.get(i2);
            if (aVar.f1501a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f1499f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1495b.size();
        q qVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f1495b.get(i2);
            Fragment Z = this.f1498e.Z(aVar.f1501a);
            aVar.f1504d = Z;
            if (Z != null && !Z.u0()) {
                if (aVar.f1501a.equals(currentTabTag)) {
                    this.h = aVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f1498e.j();
                    }
                    qVar.k(aVar.f1504d);
                }
            }
        }
        this.i = true;
        q a2 = a(currentTabTag, qVar);
        if (a2 != null) {
            a2.h();
            this.f1498e.V();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f1500b);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1500b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        q a2;
        if (this.i && (a2 = a(str, (q) null)) != null) {
            a2.h();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.g = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, k kVar) {
        c(context);
        super.setup();
        this.f1497d = context;
        this.f1498e = kVar;
        b();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, k kVar, int i2) {
        c(context);
        super.setup();
        this.f1497d = context;
        this.f1498e = kVar;
        this.f1499f = i2;
        b();
        this.f1496c.setId(i2);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
