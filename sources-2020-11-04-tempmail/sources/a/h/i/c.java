package a.h.i;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat */
public class c implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    private final Spannable f329b;

    /* renamed from: c  reason: collision with root package name */
    private final a f330c;

    public a a() {
        return this.f330c;
    }

    public char charAt(int i) {
        return this.f329b.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f329b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f329b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f329b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f329b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f329b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f329b.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f329b.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f329b.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f329b.subSequence(i, i2);
    }

    public String toString() {
        return this.f329b.toString();
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f331a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f332b;

        /* renamed from: c  reason: collision with root package name */
        private final int f333c;

        /* renamed from: d  reason: collision with root package name */
        private final int f334d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f335e = null;

        /* renamed from: a.h.i.c$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0010a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f336a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f337b;

            /* renamed from: c  reason: collision with root package name */
            private int f338c;

            /* renamed from: d  reason: collision with root package name */
            private int f339d;

            public C0010a(TextPaint textPaint) {
                this.f336a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f338c = 1;
                    this.f339d = 1;
                } else {
                    this.f339d = 0;
                    this.f338c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f337b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f337b = null;
                }
            }

            public a a() {
                return new a(this.f336a, this.f337b, this.f338c, this.f339d);
            }

            public C0010a b(int i) {
                this.f338c = i;
                return this;
            }

            public C0010a c(int i) {
                this.f339d = i;
                return this;
            }

            public C0010a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f337b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f331a = textPaint;
            this.f332b = textDirectionHeuristic;
            this.f333c = i;
            this.f334d = i2;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.f335e;
            if (params != null) {
                return params.equals(aVar.f335e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f333c != aVar.b() || this.f334d != aVar.c())) || this.f331a.getTextSize() != aVar.e().getTextSize() || this.f331a.getTextScaleX() != aVar.e().getTextScaleX() || this.f331a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f331a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f331a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f331a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f331a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f331a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f331a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f331a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f333c;
        }

        public int c() {
            return this.f334d;
        }

        public TextDirectionHeuristic d() {
            return this.f332b;
        }

        public TextPaint e() {
            return this.f331a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f332b == aVar.d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return a.h.j.c.b(Float.valueOf(this.f331a.getTextSize()), Float.valueOf(this.f331a.getTextScaleX()), Float.valueOf(this.f331a.getTextSkewX()), Float.valueOf(this.f331a.getLetterSpacing()), Integer.valueOf(this.f331a.getFlags()), this.f331a.getTextLocales(), this.f331a.getTypeface(), Boolean.valueOf(this.f331a.isElegantTextHeight()), this.f332b, Integer.valueOf(this.f333c), Integer.valueOf(this.f334d));
            } else if (i >= 21) {
                return a.h.j.c.b(Float.valueOf(this.f331a.getTextSize()), Float.valueOf(this.f331a.getTextScaleX()), Float.valueOf(this.f331a.getTextSkewX()), Float.valueOf(this.f331a.getLetterSpacing()), Integer.valueOf(this.f331a.getFlags()), this.f331a.getTextLocale(), this.f331a.getTypeface(), Boolean.valueOf(this.f331a.isElegantTextHeight()), this.f332b, Integer.valueOf(this.f333c), Integer.valueOf(this.f334d));
            } else if (i >= 18) {
                return a.h.j.c.b(Float.valueOf(this.f331a.getTextSize()), Float.valueOf(this.f331a.getTextScaleX()), Float.valueOf(this.f331a.getTextSkewX()), Integer.valueOf(this.f331a.getFlags()), this.f331a.getTextLocale(), this.f331a.getTypeface(), this.f332b, Integer.valueOf(this.f333c), Integer.valueOf(this.f334d));
            } else if (i >= 17) {
                return a.h.j.c.b(Float.valueOf(this.f331a.getTextSize()), Float.valueOf(this.f331a.getTextScaleX()), Float.valueOf(this.f331a.getTextSkewX()), Integer.valueOf(this.f331a.getFlags()), this.f331a.getTextLocale(), this.f331a.getTypeface(), this.f332b, Integer.valueOf(this.f333c), Integer.valueOf(this.f334d));
            } else {
                return a.h.j.c.b(Float.valueOf(this.f331a.getTextSize()), Float.valueOf(this.f331a.getTextScaleX()), Float.valueOf(this.f331a.getTextSkewX()), Integer.valueOf(this.f331a.getFlags()), this.f331a.getTypeface(), this.f332b, Integer.valueOf(this.f333c), Integer.valueOf(this.f334d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f331a.getTextSize());
            sb.append(", textScaleX=" + this.f331a.getTextScaleX());
            sb.append(", textSkewX=" + this.f331a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f331a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f331a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f331a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f331a.getTextLocale());
            }
            sb.append(", typeface=" + this.f331a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f331a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f332b);
            sb.append(", breakStrategy=" + this.f333c);
            sb.append(", hyphenationFrequency=" + this.f334d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f331a = params.getTextPaint();
            this.f332b = params.getTextDirection();
            this.f333c = params.getBreakStrategy();
            this.f334d = params.getHyphenationFrequency();
        }
    }
}
