package androidx.appcompat.widget;

import a.h.k.u;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements a.a.n.c {
    static final k r0 = new k();
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    private m L;
    private l M;
    View.OnFocusChangeListener N;
    private n O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    a.i.a.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;
    private int a0;
    private boolean b0;
    private CharSequence c0;
    private CharSequence d0;
    private boolean e0;
    private int f0;
    SearchableInfo g0;
    private Bundle h0;
    private final Runnable i0;
    private Runnable j0;
    private final WeakHashMap<String, Drawable.ConstantState> k0;
    private final View.OnClickListener l0;
    View.OnKeyListener m0;
    private final TextView.OnEditorActionListener n0;
    private final AdapterView.OnItemClickListener o0;
    private final AdapterView.OnItemSelectedListener p0;
    final SearchAutoComplete q;
    private TextWatcher q0;
    private final View r;
    private final View s;
    private final View t;
    final ImageView u;
    final ImageView v;
    final ImageView w;
    final ImageView x;
    private final View y;
    private o z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        boolean f1038d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1038d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1038d));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1038d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e  reason: collision with root package name */
        private int f1039e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f1040f;
        private boolean g;
        final Runnable h;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1039e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1040f.Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1040f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1040f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.M(getContext())) {
                    SearchView.r0.c(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1040f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1039e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.f1039e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.e0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a.i.a.a aVar = SearchView.this.S;
            if (aVar != null && (aVar instanceof v)) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.V();
            } else if (view == searchView.w) {
                searchView.R();
            } else if (view == searchView.v) {
                searchView.W();
            } else if (view == searchView.x) {
                searchView.a0();
            } else if (view == searchView.q) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.g0 == null) {
                return false;
            }
            if (searchView.q.isPopupShowing() && SearchView.this.q.getListSelection() != -1) {
                return SearchView.this.X(view, i, keyEvent);
            }
            if (SearchView.this.q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.S(i, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private Method f1052a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1053b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1054c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1052a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1053b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1054c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1053b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1052a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f1054c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    private static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1055a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1056b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1057c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1058d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f1059e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1060f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1059e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1055a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1056b.set(rect);
            this.f1058d.set(rect);
            Rect rect3 = this.f1058d;
            int i = this.f1059e;
            rect3.inset(-i, -i);
            this.f1057c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1060f
                r7.f1060f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1060f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1058d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1056b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1060f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1057c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1055a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1055a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1057c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1055a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.g0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int i3;
        Uri uri;
        String o2;
        try {
            String o3 = v.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.g0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = v.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.g0.getSuggestIntentData();
            }
            if (!(o4 == null || (o2 = v.o(cursor, "suggest_intent_data_id")) == null)) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            if (o4 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o4);
            }
            return C(str2, uri, v.o(cursor, "suggest_intent_extra_data"), v.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.q.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.q.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.I;
        } else if (this.g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.J;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.T || this.b0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e("SearchView", "Failed launch activity: " + intent, e2);
            }
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor b2 = this.S.b();
        if (b2 == null || !b2.moveToPosition(i2)) {
            return false;
        }
        O(D(b2, i3, str));
        return true;
    }

    private void b0() {
        post(this.i0);
    }

    private void c0(int i2) {
        Editable text = this.q.getText();
        Cursor b2 = this.S.b();
        if (b2 != null) {
            if (b2.moveToPosition(i2)) {
                CharSequence c2 = this.S.c(b2);
                if (c2 != null) {
                    setQuery(c2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void d0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        int i2 = 0;
        if (!z3 && (!this.Q || this.e0)) {
            z2 = false;
        }
        ImageView imageView = this.w;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void f0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private void g0() {
        this.q.setThreshold(this.g0.getSuggestThreshold());
        this.q.setImeOptions(this.g0.getImeOptions());
        int inputType = this.g0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.q.setInputType(inputType);
        a.i.a.a aVar = this.S;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.g0.getSuggestAuthority() != null) {
            v vVar = new v(getContext(), this, this.g0, this.k0);
            this.S = vVar;
            this.q.setAdapter(vVar);
            v vVar2 = (v) this.S;
            if (this.V) {
                i2 = 2;
            }
            vVar2.x(i2);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.a.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.a.d.abc_search_view_preferred_width);
    }

    private void h0() {
        this.t.setVisibility((!N() || !(this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) ? 8 : 0);
    }

    private void i0(boolean z2) {
        this.v.setVisibility((!this.T || !N() || !hasFocus() || (!z2 && this.b0)) ? 8 : 0);
    }

    private void j0(boolean z2) {
        this.R = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        i0(z3);
        this.r.setVisibility(z2 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i2 = 8;
        }
        this.E.setVisibility(i2);
        d0();
        k0(!z3);
        h0();
    }

    private void k0(boolean z2) {
        int i2 = 8;
        if (this.b0 && !L() && z2) {
            this.v.setVisibility(8);
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i2;
        if (this.y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.s.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = h0.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(a.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(a.a.d.abc_dropdownitem_text_padding_left) : 0;
            this.q.getDropDownBackground().getPadding(rect);
            if (b2) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.q.setDropDownHorizontalOffset(i2);
            this.q.setDropDownWidth((((this.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        r0.b(this.q);
        r0.a(this.q);
    }

    public boolean L() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText("");
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.Q) {
            l lVar = this.M;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                j0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i2, int i3, String str) {
        n nVar = this.O;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        Q(i2, 0, (String) null);
        this.q.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i2) {
        n nVar = this.O;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        c0(i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        j0(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.L;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.g0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.q.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i2, KeyEvent keyEvent) {
        int i3;
        if (this.g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.q.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                if (i2 == 21) {
                    i3 = 0;
                } else {
                    i3 = this.q.length();
                }
                this.q.setSelection(i3);
                this.q.setListSelection(0);
                this.q.clearListSelection();
                r0.c(this.q, true);
                return true;
            } else if (i2 != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.q.getText();
        this.d0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        i0(z2);
        k0(!z2);
        d0();
        h0();
        if (this.L != null && !TextUtils.equals(charSequence, this.c0)) {
            this.L.a(charSequence.toString());
        }
        this.c0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        j0(L());
        b0();
        if (this.q.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.I, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.J, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.e0) {
            this.e0 = true;
            int imeOptions = this.q.getImeOptions();
            this.f0 = imeOptions;
            this.q.setImeOptions(imeOptions | 33554432);
            this.q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.W = false;
    }

    /* access modifiers changed from: package-private */
    public void e0() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void f() {
        setQuery("", false);
        clearFocus();
        j0(true);
        this.q.setImeOptions(this.f0);
        this.e0 = false;
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public int getMaxWidth() {
        return this.a0;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.K;
        }
        return getContext().getText(this.g0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.G;
    }

    public a.i.a.a getSuggestionsAdapter() {
        return this.S;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.j0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            I(this.q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            o oVar = this.z;
            if (oVar == null) {
                o oVar2 = new o(this.B, this.A, this.q);
                this.z = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.B, this.A);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.a0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.a0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        j0(savedState.f1038d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1038d = L();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        b0();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.q.requestFocus(i2, rect);
        if (requestFocus) {
            j0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            j0(z2);
            f0();
        }
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.O = nVar;
    }

    public void setQuery(CharSequence charSequence, boolean z2) {
        this.q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.d0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        f0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        a.i.a.a aVar = this.S;
        if (aVar instanceof v) {
            ((v) aVar).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.g0 = searchableInfo;
        if (searchableInfo != null) {
            g0();
            f0();
        }
        boolean K2 = K();
        this.b0 = K2;
        if (K2) {
            this.q.setPrivateImeOptions("nm");
        }
        j0(L());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        j0(L());
    }

    public void setSuggestionsAdapter(a.i.a.a aVar) {
        this.S = aVar;
        this.q.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.i0 = new b();
        this.j0 = new c();
        this.k0 = new WeakHashMap<>();
        this.l0 = new f();
        this.m0 = new g();
        this.n0 = new h();
        this.o0 = new i();
        this.p0 = new j();
        this.q0 = new a();
        b0 u2 = b0.u(context, attributeSet, a.a.j.SearchView, i2, 0);
        LayoutInflater.from(context).inflate(u2.n(a.a.j.SearchView_layout, a.a.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.a.f.search_src_text);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(a.a.f.search_edit_frame);
        this.s = findViewById(a.a.f.search_plate);
        this.t = findViewById(a.a.f.submit_area);
        this.u = (ImageView) findViewById(a.a.f.search_button);
        this.v = (ImageView) findViewById(a.a.f.search_go_btn);
        this.w = (ImageView) findViewById(a.a.f.search_close_btn);
        this.x = (ImageView) findViewById(a.a.f.search_voice_btn);
        this.E = (ImageView) findViewById(a.a.f.search_mag_icon);
        u.b0(this.s, u2.g(a.a.j.SearchView_queryBackground));
        u.b0(this.t, u2.g(a.a.j.SearchView_submitBackground));
        this.u.setImageDrawable(u2.g(a.a.j.SearchView_searchIcon));
        this.v.setImageDrawable(u2.g(a.a.j.SearchView_goIcon));
        this.w.setImageDrawable(u2.g(a.a.j.SearchView_closeIcon));
        this.x.setImageDrawable(u2.g(a.a.j.SearchView_voiceIcon));
        this.E.setImageDrawable(u2.g(a.a.j.SearchView_searchIcon));
        this.F = u2.g(a.a.j.SearchView_searchHintIcon);
        d0.a(this.u, getResources().getString(a.a.h.abc_searchview_description_search));
        this.G = u2.n(a.a.j.SearchView_suggestionRowLayout, a.a.g.abc_search_dropdown_item_icons_2line);
        this.H = u2.n(a.a.j.SearchView_commitIcon, 0);
        this.u.setOnClickListener(this.l0);
        this.w.setOnClickListener(this.l0);
        this.v.setOnClickListener(this.l0);
        this.x.setOnClickListener(this.l0);
        this.q.setOnClickListener(this.l0);
        this.q.addTextChangedListener(this.q0);
        this.q.setOnEditorActionListener(this.n0);
        this.q.setOnItemClickListener(this.o0);
        this.q.setOnItemSelectedListener(this.p0);
        this.q.setOnKeyListener(this.m0);
        this.q.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u2.a(a.a.j.SearchView_iconifiedByDefault, true));
        int f2 = u2.f(a.a.j.SearchView_android_maxWidth, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.K = u2.p(a.a.j.SearchView_defaultQueryHint);
        this.U = u2.p(a.a.j.SearchView_queryHint);
        int k2 = u2.k(a.a.j.SearchView_android_imeOptions, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = u2.k(a.a.j.SearchView_android_inputType, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(u2.a(a.a.j.SearchView_android_focusable, true));
        u2.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.q.getDropDownAnchor());
        this.y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        j0(this.Q);
        f0();
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
