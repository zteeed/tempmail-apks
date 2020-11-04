package androidx.appcompat.widget;

import a.a.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
class l {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1134a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1135b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1136c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1137d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1138e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1139f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;

    l(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1134a = 0;
        this.f1137d = -1.0f;
        this.f1138e = -1.0f;
        this.f1136c = -1.0f;
        this.f1139f = new int[0];
        this.f1135b = false;
    }

    private StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i2).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        boolean z;
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT >= 16) {
            f3 = this.i.getLineSpacingMultiplier();
            f2 = this.i.getLineSpacingExtra();
            z = this.i.getIncludeFontPadding();
        } else {
            f3 = ((Float) m(this.i, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f2 = ((Float) m(this.i, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m(this.i, "getIncludeFontPadding", Boolean.TRUE)).booleanValue();
        }
        return new StaticLayout(charSequence, this.h, i2, alignment, f3, f2, z);
    }

    private int f(RectF rectF) {
        int length = this.f1139f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (x(this.f1139f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f1139f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private Method l(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private <T> T m(Object obj, String str, T t) {
        try {
            return l(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void s(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f1135b = false;
                try {
                    Method l2 = l("nullLayouts");
                    if (l2 != null) {
                        l2.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean u() {
        if (!y() || this.f1134a != 1) {
            this.f1135b = false;
        } else {
            if (!this.g || this.f1139f.length == 0) {
                float round = (float) Math.round(this.f1137d);
                int i2 = 1;
                while (Math.round(this.f1136c + round) <= Math.round(this.f1138e)) {
                    i2++;
                    round += this.f1136c;
                }
                int[] iArr = new int[i2];
                float f2 = this.f1137d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f1136c;
                }
                this.f1139f = b(iArr);
            }
            this.f1135b = true;
        }
        return this.f1135b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f1139f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int length = this.f1139f.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f1134a = 1;
            int[] iArr = this.f1139f;
            this.f1137d = (float) iArr[0];
            this.f1138e = (float) iArr[length - 1];
            this.f1136c = -1.0f;
        }
        return this.g;
    }

    private boolean x(int i2, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float) i2);
        Layout.Alignment alignment = (Layout.Alignment) m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = d(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = e(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.i instanceof AppCompatEditText);
    }

    private void z(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size " + "text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f1134a = 1;
            this.f1137d = f2;
            this.f1138e = f3;
            this.f1136c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i2;
        if (n()) {
            if (this.f1135b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (((Boolean) m(this.i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue()) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (k) {
                            k.setEmpty();
                            k.right = (float) i2;
                            k.bottom = (float) height;
                            float f2 = (float) f(k);
                            if (f2 != this.i.getTextSize()) {
                                t(0, f2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1135b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f1138e);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1137d);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f1136c);
    }

    /* access modifiers changed from: package-private */
    public int[] j() {
        return this.f1139f;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f1134a;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return y() && this.f1134a != 0;
    }

    /* access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.f1134a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f1134a = 0;
        } else if (this.f1134a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i2) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f1139f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i2) {
        if (!y()) {
            return;
        }
        if (i2 == 0) {
            c();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i2, float f2) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        s(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }
}
