package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1226b = {0, 4, 8};

    /* renamed from: c  reason: collision with root package name */
    private static SparseIntArray f1227c;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, b> f1228a = new HashMap<>();

    /* compiled from: ConstraintSet */
    private static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a  reason: collision with root package name */
        boolean f1229a;
        public float a0;

        /* renamed from: b  reason: collision with root package name */
        public int f1230b;
        public float b0;

        /* renamed from: c  reason: collision with root package name */
        public int f1231c;
        public float c0;

        /* renamed from: d  reason: collision with root package name */
        int f1232d;
        public float d0;

        /* renamed from: e  reason: collision with root package name */
        public int f1233e;
        public float e0;

        /* renamed from: f  reason: collision with root package name */
        public int f1234f;
        public float f0;
        public float g;
        public float g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public float q0;
        public int r;
        public boolean r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public float u;
        public int[] u0;
        public float v;
        public String v0;
        public String w;
        public int x;
        public int y;
        public float z;

        private b() {
            this.f1229a = false;
            this.f1233e = -1;
            this.f1234f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }

        /* access modifiers changed from: private */
        public void f(int i2, ConstraintLayout.a aVar) {
            this.f1232d = i2;
            this.h = aVar.f1218d;
            this.i = aVar.f1219e;
            this.j = aVar.f1220f;
            this.k = aVar.g;
            this.l = aVar.h;
            this.m = aVar.i;
            this.n = aVar.j;
            this.o = aVar.k;
            this.p = aVar.l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.m;
            this.y = aVar.n;
            this.z = aVar.o;
            this.A = aVar.P;
            this.B = aVar.Q;
            this.C = aVar.R;
            this.g = aVar.f1217c;
            this.f1233e = aVar.f1215a;
            this.f1234f = aVar.f1216b;
            this.f1230b = aVar.width;
            this.f1231c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.E;
            this.R = aVar.D;
            this.T = aVar.G;
            this.S = aVar.F;
            boolean z2 = aVar.S;
            this.h0 = z2;
            this.i0 = aVar.T;
            this.j0 = aVar.H;
            this.k0 = aVar.I;
            this.h0 = z2;
            this.l0 = aVar.L;
            this.m0 = aVar.M;
            this.n0 = aVar.J;
            this.o0 = aVar.K;
            this.p0 = aVar.N;
            this.q0 = aVar.O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void g(int i2, Constraints.a aVar) {
            f(i2, aVar);
            this.U = aVar.m0;
            this.X = aVar.p0;
            this.Y = aVar.q0;
            this.Z = aVar.r0;
            this.a0 = aVar.s0;
            this.b0 = aVar.t0;
            this.c0 = aVar.u0;
            this.d0 = aVar.v0;
            this.e0 = aVar.w0;
            this.f0 = aVar.x0;
            this.g0 = aVar.y0;
            this.W = aVar.o0;
            this.V = aVar.n0;
        }

        /* access modifiers changed from: private */
        public void h(ConstraintHelper constraintHelper, int i2, Constraints.a aVar) {
            g(i2, aVar);
            if (constraintHelper instanceof Barrier) {
                this.t0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.s0 = barrier.getType();
                this.u0 = barrier.getReferencedIds();
            }
        }

        public void d(ConstraintLayout.a aVar) {
            aVar.f1218d = this.h;
            aVar.f1219e = this.i;
            aVar.f1220f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.P = this.A;
            aVar.Q = this.B;
            aVar.E = this.Q;
            aVar.D = this.R;
            aVar.G = this.T;
            aVar.F = this.S;
            aVar.S = this.h0;
            aVar.T = this.i0;
            aVar.H = this.j0;
            aVar.I = this.k0;
            aVar.L = this.l0;
            aVar.M = this.m0;
            aVar.J = this.n0;
            aVar.K = this.o0;
            aVar.N = this.p0;
            aVar.O = this.q0;
            aVar.R = this.C;
            aVar.f1217c = this.g;
            aVar.f1215a = this.f1233e;
            aVar.f1216b = this.f1234f;
            aVar.width = this.f1230b;
            aVar.height = this.f1231c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }

        /* renamed from: e */
        public b clone() {
            b bVar = new b();
            bVar.f1229a = this.f1229a;
            bVar.f1230b = this.f1230b;
            bVar.f1231c = this.f1231c;
            bVar.f1233e = this.f1233e;
            bVar.f1234f = this.f1234f;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.l = this.l;
            bVar.m = this.m;
            bVar.n = this.n;
            bVar.o = this.o;
            bVar.p = this.p;
            bVar.q = this.q;
            bVar.r = this.r;
            bVar.s = this.s;
            bVar.t = this.t;
            bVar.u = this.u;
            bVar.v = this.v;
            bVar.w = this.w;
            bVar.A = this.A;
            bVar.B = this.B;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.C = this.C;
            bVar.D = this.D;
            bVar.E = this.E;
            bVar.F = this.F;
            bVar.G = this.G;
            bVar.H = this.H;
            bVar.I = this.I;
            bVar.J = this.J;
            bVar.K = this.K;
            bVar.L = this.L;
            bVar.M = this.M;
            bVar.N = this.N;
            bVar.O = this.O;
            bVar.P = this.P;
            bVar.Q = this.Q;
            bVar.R = this.R;
            bVar.S = this.S;
            bVar.T = this.T;
            bVar.U = this.U;
            bVar.V = this.V;
            bVar.W = this.W;
            bVar.X = this.X;
            bVar.Y = this.Y;
            bVar.Z = this.Z;
            bVar.a0 = this.a0;
            bVar.b0 = this.b0;
            bVar.c0 = this.c0;
            bVar.d0 = this.d0;
            bVar.e0 = this.e0;
            bVar.f0 = this.f0;
            bVar.g0 = this.g0;
            bVar.h0 = this.h0;
            bVar.i0 = this.i0;
            bVar.j0 = this.j0;
            bVar.k0 = this.k0;
            bVar.l0 = this.l0;
            bVar.m0 = this.m0;
            bVar.n0 = this.n0;
            bVar.o0 = this.o0;
            bVar.p0 = this.p0;
            bVar.q0 = this.q0;
            bVar.s0 = this.s0;
            bVar.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                bVar.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.x = this.x;
            bVar.y = this.y;
            bVar.z = this.z;
            bVar.r0 = this.r0;
            return bVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1227c = sparseIntArray;
        sparseIntArray.append(c.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1227c.append(c.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1227c.append(c.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1227c.append(c.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1227c.append(c.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1227c.append(c.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1227c.append(c.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1227c.append(c.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1227c.append(c.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1227c.append(c.ConstraintSet_layout_editor_absoluteX, 6);
        f1227c.append(c.ConstraintSet_layout_editor_absoluteY, 7);
        f1227c.append(c.ConstraintSet_layout_constraintGuide_begin, 17);
        f1227c.append(c.ConstraintSet_layout_constraintGuide_end, 18);
        f1227c.append(c.ConstraintSet_layout_constraintGuide_percent, 19);
        f1227c.append(c.ConstraintSet_android_orientation, 27);
        f1227c.append(c.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1227c.append(c.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1227c.append(c.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1227c.append(c.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1227c.append(c.ConstraintSet_layout_goneMarginLeft, 13);
        f1227c.append(c.ConstraintSet_layout_goneMarginTop, 16);
        f1227c.append(c.ConstraintSet_layout_goneMarginRight, 14);
        f1227c.append(c.ConstraintSet_layout_goneMarginBottom, 11);
        f1227c.append(c.ConstraintSet_layout_goneMarginStart, 15);
        f1227c.append(c.ConstraintSet_layout_goneMarginEnd, 12);
        f1227c.append(c.ConstraintSet_layout_constraintVertical_weight, 40);
        f1227c.append(c.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1227c.append(c.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1227c.append(c.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1227c.append(c.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1227c.append(c.ConstraintSet_layout_constraintVertical_bias, 37);
        f1227c.append(c.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1227c.append(c.ConstraintSet_layout_constraintLeft_creator, 75);
        f1227c.append(c.ConstraintSet_layout_constraintTop_creator, 75);
        f1227c.append(c.ConstraintSet_layout_constraintRight_creator, 75);
        f1227c.append(c.ConstraintSet_layout_constraintBottom_creator, 75);
        f1227c.append(c.ConstraintSet_layout_constraintBaseline_creator, 75);
        f1227c.append(c.ConstraintSet_android_layout_marginLeft, 24);
        f1227c.append(c.ConstraintSet_android_layout_marginRight, 28);
        f1227c.append(c.ConstraintSet_android_layout_marginStart, 31);
        f1227c.append(c.ConstraintSet_android_layout_marginEnd, 8);
        f1227c.append(c.ConstraintSet_android_layout_marginTop, 34);
        f1227c.append(c.ConstraintSet_android_layout_marginBottom, 2);
        f1227c.append(c.ConstraintSet_android_layout_width, 23);
        f1227c.append(c.ConstraintSet_android_layout_height, 21);
        f1227c.append(c.ConstraintSet_android_visibility, 22);
        f1227c.append(c.ConstraintSet_android_alpha, 43);
        f1227c.append(c.ConstraintSet_android_elevation, 44);
        f1227c.append(c.ConstraintSet_android_rotationX, 45);
        f1227c.append(c.ConstraintSet_android_rotationY, 46);
        f1227c.append(c.ConstraintSet_android_rotation, 60);
        f1227c.append(c.ConstraintSet_android_scaleX, 47);
        f1227c.append(c.ConstraintSet_android_scaleY, 48);
        f1227c.append(c.ConstraintSet_android_transformPivotX, 49);
        f1227c.append(c.ConstraintSet_android_transformPivotY, 50);
        f1227c.append(c.ConstraintSet_android_translationX, 51);
        f1227c.append(c.ConstraintSet_android_translationY, 52);
        f1227c.append(c.ConstraintSet_android_translationZ, 53);
        f1227c.append(c.ConstraintSet_layout_constraintWidth_default, 54);
        f1227c.append(c.ConstraintSet_layout_constraintHeight_default, 55);
        f1227c.append(c.ConstraintSet_layout_constraintWidth_max, 56);
        f1227c.append(c.ConstraintSet_layout_constraintHeight_max, 57);
        f1227c.append(c.ConstraintSet_layout_constraintWidth_min, 58);
        f1227c.append(c.ConstraintSet_layout_constraintHeight_min, 59);
        f1227c.append(c.ConstraintSet_layout_constraintCircle, 61);
        f1227c.append(c.ConstraintSet_layout_constraintCircleRadius, 62);
        f1227c.append(c.ConstraintSet_layout_constraintCircleAngle, 63);
        f1227c.append(c.ConstraintSet_android_id, 38);
        f1227c.append(c.ConstraintSet_layout_constraintWidth_percent, 69);
        f1227c.append(c.ConstraintSet_layout_constraintHeight_percent, 70);
        f1227c.append(c.ConstraintSet_chainUseRtl, 71);
        f1227c.append(c.ConstraintSet_barrierDirection, 72);
        f1227c.append(c.ConstraintSet_constraint_referenced_ids, 73);
        f1227c.append(c.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    private int[] g(View view, String str) {
        int i;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = b.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i = ((Integer) c2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private b i(Context context, AttributeSet attributeSet) {
        b bVar = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.ConstraintSet);
        m(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    private b j(int i) {
        if (!this.f1228a.containsKey(Integer.valueOf(i))) {
            this.f1228a.put(Integer.valueOf(i), new b());
        }
        return this.f1228a.get(Integer.valueOf(i));
    }

    private static int l(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private void m(b bVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1227c.get(index);
            switch (i2) {
                case 1:
                    bVar.p = l(typedArray, index, bVar.p);
                    break;
                case 2:
                    bVar.G = typedArray.getDimensionPixelSize(index, bVar.G);
                    break;
                case 3:
                    bVar.o = l(typedArray, index, bVar.o);
                    break;
                case 4:
                    bVar.n = l(typedArray, index, bVar.n);
                    break;
                case 5:
                    bVar.w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.A = typedArray.getDimensionPixelOffset(index, bVar.A);
                    break;
                case 7:
                    bVar.B = typedArray.getDimensionPixelOffset(index, bVar.B);
                    break;
                case 8:
                    bVar.H = typedArray.getDimensionPixelSize(index, bVar.H);
                    break;
                case 9:
                    bVar.t = l(typedArray, index, bVar.t);
                    break;
                case 10:
                    bVar.s = l(typedArray, index, bVar.s);
                    break;
                case 11:
                    bVar.N = typedArray.getDimensionPixelSize(index, bVar.N);
                    break;
                case 12:
                    bVar.O = typedArray.getDimensionPixelSize(index, bVar.O);
                    break;
                case 13:
                    bVar.K = typedArray.getDimensionPixelSize(index, bVar.K);
                    break;
                case 14:
                    bVar.M = typedArray.getDimensionPixelSize(index, bVar.M);
                    break;
                case 15:
                    bVar.P = typedArray.getDimensionPixelSize(index, bVar.P);
                    break;
                case 16:
                    bVar.L = typedArray.getDimensionPixelSize(index, bVar.L);
                    break;
                case 17:
                    bVar.f1233e = typedArray.getDimensionPixelOffset(index, bVar.f1233e);
                    break;
                case 18:
                    bVar.f1234f = typedArray.getDimensionPixelOffset(index, bVar.f1234f);
                    break;
                case 19:
                    bVar.g = typedArray.getFloat(index, bVar.g);
                    break;
                case 20:
                    bVar.u = typedArray.getFloat(index, bVar.u);
                    break;
                case 21:
                    bVar.f1231c = typedArray.getLayoutDimension(index, bVar.f1231c);
                    break;
                case 22:
                    int i3 = typedArray.getInt(index, bVar.J);
                    bVar.J = i3;
                    bVar.J = f1226b[i3];
                    break;
                case 23:
                    bVar.f1230b = typedArray.getLayoutDimension(index, bVar.f1230b);
                    break;
                case 24:
                    bVar.D = typedArray.getDimensionPixelSize(index, bVar.D);
                    break;
                case 25:
                    bVar.h = l(typedArray, index, bVar.h);
                    break;
                case 26:
                    bVar.i = l(typedArray, index, bVar.i);
                    break;
                case 27:
                    bVar.C = typedArray.getInt(index, bVar.C);
                    break;
                case 28:
                    bVar.E = typedArray.getDimensionPixelSize(index, bVar.E);
                    break;
                case 29:
                    bVar.j = l(typedArray, index, bVar.j);
                    break;
                case 30:
                    bVar.k = l(typedArray, index, bVar.k);
                    break;
                case 31:
                    bVar.I = typedArray.getDimensionPixelSize(index, bVar.I);
                    break;
                case 32:
                    bVar.q = l(typedArray, index, bVar.q);
                    break;
                case 33:
                    bVar.r = l(typedArray, index, bVar.r);
                    break;
                case 34:
                    bVar.F = typedArray.getDimensionPixelSize(index, bVar.F);
                    break;
                case 35:
                    bVar.m = l(typedArray, index, bVar.m);
                    break;
                case 36:
                    bVar.l = l(typedArray, index, bVar.l);
                    break;
                case 37:
                    bVar.v = typedArray.getFloat(index, bVar.v);
                    break;
                case 38:
                    bVar.f1232d = typedArray.getResourceId(index, bVar.f1232d);
                    break;
                case 39:
                    bVar.R = typedArray.getFloat(index, bVar.R);
                    break;
                case 40:
                    bVar.Q = typedArray.getFloat(index, bVar.Q);
                    break;
                case 41:
                    bVar.S = typedArray.getInt(index, bVar.S);
                    break;
                case 42:
                    bVar.T = typedArray.getInt(index, bVar.T);
                    break;
                case 43:
                    bVar.U = typedArray.getFloat(index, bVar.U);
                    break;
                case 44:
                    bVar.V = true;
                    bVar.W = typedArray.getDimension(index, bVar.W);
                    break;
                case 45:
                    bVar.Y = typedArray.getFloat(index, bVar.Y);
                    break;
                case 46:
                    bVar.Z = typedArray.getFloat(index, bVar.Z);
                    break;
                case 47:
                    bVar.a0 = typedArray.getFloat(index, bVar.a0);
                    break;
                case 48:
                    bVar.b0 = typedArray.getFloat(index, bVar.b0);
                    break;
                case 49:
                    bVar.c0 = typedArray.getFloat(index, bVar.c0);
                    break;
                case 50:
                    bVar.d0 = typedArray.getFloat(index, bVar.d0);
                    break;
                case 51:
                    bVar.e0 = typedArray.getDimension(index, bVar.e0);
                    break;
                case 52:
                    bVar.f0 = typedArray.getDimension(index, bVar.f0);
                    break;
                case 53:
                    bVar.g0 = typedArray.getDimension(index, bVar.g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.X = typedArray.getFloat(index, bVar.X);
                            break;
                        case 61:
                            bVar.x = l(typedArray, index, bVar.x);
                            break;
                        case 62:
                            bVar.y = typedArray.getDimensionPixelSize(index, bVar.y);
                            break;
                        case 63:
                            bVar.z = typedArray.getFloat(index, bVar.z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    bVar.p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    bVar.s0 = typedArray.getInt(index, bVar.s0);
                                    break;
                                case 73:
                                    bVar.v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.r0 = typedArray.getBoolean(index, bVar.r0);
                                    break;
                                case 75:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1227c.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1227c.get(index));
                                    break;
                            }
                    }
            }
        }
    }

    private String n(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet((a) null);
    }

    /* access modifiers changed from: package-private */
    public void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1228a.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f1228a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    b bVar = this.f1228a.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        bVar.t0 = 1;
                    }
                    int i2 = bVar.t0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(bVar.s0);
                        barrier.setAllowsGoneWidget(bVar.r0);
                        int[] iArr = bVar.u0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.v0;
                            if (str != null) {
                                int[] g = g(barrier, str);
                                bVar.u0 = g;
                                barrier.setReferencedIds(g);
                            }
                        }
                    }
                    ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                    bVar.d(aVar);
                    childAt.setLayoutParams(aVar);
                    childAt.setVisibility(bVar.J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(bVar.U);
                        childAt.setRotation(bVar.X);
                        childAt.setRotationX(bVar.Y);
                        childAt.setRotationY(bVar.Z);
                        childAt.setScaleX(bVar.a0);
                        childAt.setScaleY(bVar.b0);
                        if (!Float.isNaN(bVar.c0)) {
                            childAt.setPivotX(bVar.c0);
                        }
                        if (!Float.isNaN(bVar.d0)) {
                            childAt.setPivotY(bVar.d0);
                        }
                        childAt.setTranslationX(bVar.e0);
                        childAt.setTranslationY(bVar.f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(bVar.g0);
                            if (bVar.V) {
                                childAt.setElevation(bVar.W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            b bVar2 = this.f1228a.get(num);
            int i3 = bVar2.t0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.v0;
                    if (str2 != null) {
                        int[] g2 = g(barrier2, str2);
                        bVar2.u0 = g2;
                        barrier2.setReferencedIds(g2);
                    }
                }
                barrier2.setType(bVar2.s0);
                ConstraintLayout.a a2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.f();
                bVar2.d(a2);
                constraintLayout.addView(barrier2, a2);
            }
            if (bVar2.f1229a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a a3 = constraintLayout.generateDefaultLayoutParams();
                bVar2.d(a3);
                constraintLayout.addView(guideline, a3);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1228a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f1228a.containsKey(Integer.valueOf(id))) {
                    this.f1228a.put(Integer.valueOf(id), new b());
                }
                b bVar = this.f1228a.get(Integer.valueOf(id));
                bVar.f(id, aVar);
                bVar.J = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    bVar.U = childAt.getAlpha();
                    bVar.X = childAt.getRotation();
                    bVar.Y = childAt.getRotationX();
                    bVar.Z = childAt.getRotationY();
                    bVar.a0 = childAt.getScaleX();
                    bVar.b0 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        bVar.c0 = pivotX;
                        bVar.d0 = pivotY;
                    }
                    bVar.e0 = childAt.getTranslationX();
                    bVar.f0 = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        bVar.g0 = childAt.getTranslationZ();
                        if (bVar.V) {
                            bVar.W = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.r0 = barrier.g();
                    bVar.u0 = barrier.getReferencedIds();
                    bVar.s0 = barrier.getType();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void d(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f1228a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f1228a.containsKey(Integer.valueOf(id))) {
                    this.f1228a.put(Integer.valueOf(id), new b());
                }
                b bVar = this.f1228a.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    bVar.h((ConstraintHelper) childAt, id, aVar);
                }
                bVar.g(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        if (!this.f1228a.containsKey(Integer.valueOf(i))) {
            this.f1228a.put(Integer.valueOf(i), new b());
        }
        b bVar = this.f1228a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.h = i3;
                    bVar.i = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.i = i3;
                    bVar.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + n(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    bVar.j = i3;
                    bVar.k = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.k = i3;
                    bVar.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    bVar.l = i3;
                    bVar.m = -1;
                    bVar.p = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.m = i3;
                    bVar.l = -1;
                    bVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    bVar.o = i3;
                    bVar.n = -1;
                    bVar.p = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.n = i3;
                    bVar.o = -1;
                    bVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    bVar.p = i3;
                    bVar.o = -1;
                    bVar.n = -1;
                    bVar.l = -1;
                    bVar.m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + n(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    bVar.r = i3;
                    bVar.q = -1;
                    return;
                } else if (i4 == 7) {
                    bVar.q = i3;
                    bVar.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    bVar.t = i3;
                    bVar.s = -1;
                    return;
                } else if (i4 == 6) {
                    bVar.s = i3;
                    bVar.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(n(i2) + " to " + n(i4) + " unknown");
        }
    }

    public void f(int i, int i2, int i3, int i4, int i5) {
        if (!this.f1228a.containsKey(Integer.valueOf(i))) {
            this.f1228a.put(Integer.valueOf(i), new b());
        }
        b bVar = this.f1228a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.h = i3;
                    bVar.i = -1;
                } else if (i4 == 2) {
                    bVar.i = i3;
                    bVar.h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + n(i4) + " undefined");
                }
                bVar.D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    bVar.j = i3;
                    bVar.k = -1;
                } else if (i4 == 2) {
                    bVar.k = i3;
                    bVar.j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                bVar.E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    bVar.l = i3;
                    bVar.m = -1;
                    bVar.p = -1;
                } else if (i4 == 4) {
                    bVar.m = i3;
                    bVar.l = -1;
                    bVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                bVar.F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    bVar.o = i3;
                    bVar.n = -1;
                    bVar.p = -1;
                } else if (i4 == 3) {
                    bVar.n = i3;
                    bVar.o = -1;
                    bVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                bVar.G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    bVar.p = i3;
                    bVar.o = -1;
                    bVar.n = -1;
                    bVar.l = -1;
                    bVar.m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + n(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    bVar.r = i3;
                    bVar.q = -1;
                } else if (i4 == 7) {
                    bVar.q = i3;
                    bVar.r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                bVar.I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    bVar.t = i3;
                    bVar.s = -1;
                } else if (i4 == 6) {
                    bVar.s = i3;
                    bVar.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n(i4) + " undefined");
                }
                bVar.H = i5;
                return;
            default:
                throw new IllegalArgumentException(n(i2) + " to " + n(i4) + " unknown");
        }
    }

    public void h(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                j(iArr2[0]).Q = fArr2[0];
            }
            j(iArr2[0]).T = i5;
            f(iArr2[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr2.length; i6++) {
                int i7 = iArr2[i6];
                int i8 = i6 - 1;
                f(iArr2[i6], 3, iArr2[i8], 4, 0);
                f(iArr2[i8], 4, iArr2[i6], 3, 0);
                if (fArr2 != null) {
                    j(iArr2[i6]).Q = fArr2[i6];
                }
            }
            f(iArr2[iArr2.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    b i2 = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.f1229a = true;
                    }
                    this.f1228a.put(Integer.valueOf(i2.f1232d), i2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
