package androidx.appcompat.app;

import a.a.j;
import a.h.k.t;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f657a;

    /* renamed from: b  reason: collision with root package name */
    final i f658b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f659c;

    /* renamed from: d  reason: collision with root package name */
    private final int f660d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f661e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f662f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        private final int f663b;

        /* renamed from: c  reason: collision with root package name */
        private final int f664c;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f663b, getPaddingRight(), z2 ? getPaddingBottom() : this.f664c);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RecycleListView);
            this.f664c = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.f663b = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            r3 = r0.y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.i r3 = r3.f658b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f667b;

        b(AlertController alertController, View view, View view2) {
            this.f666a = view;
            this.f667b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.e(nestedScrollView, this.f666a, this.f667b);
        }
    }

    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f669c;

        c(View view, View view2) {
            this.f668b = view;
            this.f669c = view2;
        }

        public void run() {
            AlertController.e(AlertController.this.A, this.f668b, this.f669c);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f672b;

        d(AlertController alertController, View view, View view2) {
            this.f671a = view;
            this.f672b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.e(absListView, this.f671a, this.f672b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f674c;

        e(View view, View view2) {
            this.f673b = view;
            this.f674c = view2;
        }

        public void run() {
            AlertController.e(AlertController.this.g, this.f673b, this.f674c);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f676a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f677b;

        /* renamed from: c  reason: collision with root package name */
        public int f678c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f679d;

        /* renamed from: e  reason: collision with root package name */
        public int f680e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f681f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f682b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f682b = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i]) {
                    this.f682b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: b  reason: collision with root package name */
            private final int f684b;

            /* renamed from: c  reason: collision with root package name */
            private final int f685c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ RecycleListView f686d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AlertController f687e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f686d = recycleListView;
                this.f687e = alertController;
                Cursor cursor2 = getCursor();
                this.f684b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f685c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f684b));
                RecycleListView recycleListView = this.f686d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f685c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f677b.inflate(this.f687e.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f689b;

            c(AlertController alertController) {
                this.f689b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                f.this.x.onClick(this.f689b.f658b, i);
                if (!f.this.H) {
                    this.f689b.f658b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecycleListView f691b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AlertController f692c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f691b = recycleListView;
                this.f692c = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i] = this.f691b.isItemChecked(i);
                }
                f.this.J.onClick(this.f692c.f658b, i, this.f691b.isItemChecked(i));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f676a = context;
            this.r = true;
            this.f677b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f677b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f676a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f676a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f676a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f676a
                java.lang.CharSequence[] r3 = r10.v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f681f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f679d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i2 = this.f678c;
                if (i2 != 0) {
                    alertController.l(i2);
                }
                int i3 = this.f680e;
                if (i3 != 0) {
                    alertController.l(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            if (!(this.i == null && this.j == null)) {
                alertController.j(-1, this.i, this.k, (Message) null, this.j);
            }
            if (!(this.l == null && this.m == null)) {
                alertController.j(-2, this.l, this.n, (Message) null, this.m);
            }
            if (!(this.o == null && this.p == null)) {
                alertController.j(-3, this.o, this.q, (Message) null, this.p);
            }
            if (!(this.v == null && this.K == null && this.w == null)) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 == null) {
                int i4 = this.y;
                if (i4 != 0) {
                    alertController.q(i4);
                }
            } else if (this.E) {
                alertController.s(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.r(view2);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f694a;

        public g(DialogInterface dialogInterface) {
            this.f694a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f694a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i iVar, Window window) {
        this.f657a = context;
        this.f658b = iVar;
        this.f659c = window;
        this.R = new g(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.AlertDialog, a.a.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(j.AlertDialog_showTitle, true);
        this.f660d = obtainStyledAttributes.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        iVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void e(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i2 = this.K;
        if (i2 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i2;
        }
        return this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.f659c.findViewById(a.a.f.scrollIndicatorUp);
        View findViewById2 = this.f659c.findViewById(a.a.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            t.o0(view, i2, i3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i2 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i2 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f662f != null) {
                this.A.setOnScrollChangeListener(new b(this, findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.g;
            if (listView != null) {
                listView.setOnScrollListener(new d(this, findViewById, findViewById2));
                this.g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void t(ViewGroup viewGroup) {
        boolean z2;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.o = button;
        button.setOnClickListener(this.S);
        boolean z3 = true;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.f660d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.o.setVisibility(0);
            z2 = true;
        } else {
            this.o.setVisibility(8);
            z2 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.f660d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.s.setVisibility(0);
            z2 |= true;
        } else {
            this.s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.r;
            if (drawable3 != null) {
                int i4 = this.f660d;
                drawable3.setBounds(0, 0, i4, i4);
                this.o.setCompoundDrawables(this.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.w.setVisibility(0);
            z2 |= true;
        } else {
            this.w.setVisibility(8);
        }
        if (y(this.f657a)) {
            if (z2) {
                b(this.o);
            } else if (z2) {
                b(this.s);
            } else if (z2) {
                b(this.w);
            }
        }
        if (!z2) {
            z3 = false;
        }
        if (!z3) {
            viewGroup.setVisibility(8);
        }
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f659c.findViewById(a.a.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f662f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        View view = this.h;
        boolean z2 = false;
        if (view == null) {
            view = this.i != 0 ? LayoutInflater.from(this.f657a).inflate(this.i, viewGroup, false) : null;
        }
        if (view != null) {
            z2 = true;
        }
        if (!z2 || !a(view)) {
            this.f659c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) this.f659c.findViewById(a.a.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.g != null) {
                ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).f981a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f659c.findViewById(a.a.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f659c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f661e)) || !this.P) {
            this.f659c.findViewById(a.a.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f659c.findViewById(a.a.f.alertTitle);
        this.E = textView;
        textView.setText(this.f661e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void x() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f659c.findViewById(a.a.f.parentPanel);
        View findViewById4 = findViewById3.findViewById(a.a.f.topPanel);
        View findViewById5 = findViewById3.findViewById(a.a.f.contentPanel);
        View findViewById6 = findViewById3.findViewById(a.a.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(a.a.f.customPanel);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(a.a.f.topPanel);
        View findViewById8 = viewGroup.findViewById(a.a.f.contentPanel);
        View findViewById9 = viewGroup.findViewById(a.a.f.buttonPanel);
        ViewGroup h2 = h(findViewById7, findViewById4);
        ViewGroup h3 = h(findViewById8, findViewById5);
        ViewGroup h4 = h(findViewById9, findViewById6);
        u(h3);
        t(h4);
        w(h2);
        char c2 = 0;
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (h2 == null || h2.getVisibility() == 8) ? false : true;
        boolean z4 = (h4 == null || h4.getVisibility() == 8) ? false : true;
        if (!(z4 || h3 == null || (findViewById2 = h3.findViewById(a.a.f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z3) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f662f == null && this.g == null)) {
                view = h2.findViewById(a.a.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(h3 == null || (findViewById = h3.findViewById(a.a.f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z3, z4);
        }
        if (!z2) {
            View view2 = this.g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z4) {
                    c2 = 2;
                }
                o(h3, view2, z3 | c2 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i2 = this.I;
            if (i2 > -1) {
                listView2.setItemChecked(i2, true);
                listView2.setSelection(i2);
            }
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f657a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void d() {
        this.f658b.setContentView(i());
        x();
    }

    public boolean f(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public void j(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(CharSequence charSequence) {
        this.f662f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f661e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i2) {
        this.h = null;
        this.i = i2;
        this.n = false;
    }

    public void r(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
    }
}
