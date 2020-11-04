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
    private final Spannable f328b;

    /* renamed from: c  reason: collision with root package name */
    private final a f329c;

    public a a() {
        return this.f329c;
    }

    public char charAt(int i) {
        return this.f328b.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f328b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f328b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f328b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f328b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f328b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f328b.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f328b.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f328b.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f328b.subSequence(i, i2);
    }

    public String toString() {
        return this.f328b.toString();
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f330a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f331b;

        /* renamed from: c  reason: collision with root package name */
        private final int f332c;

        /* renamed from: d  reason: collision with root package name */
        private final int f333d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f334e = null;

        /* renamed from: a.h.i.c$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0010a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f335a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f336b;

            /* renamed from: c  reason: collision with root package name */
            private int f337c;

            /* renamed from: d  reason: collision with root package name */
            private int f338d;

            public C0010a(TextPaint textPaint) {
                this.f335a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f337c = 1;
                    this.f338d = 1;
                } else {
                    this.f338d = 0;
                    this.f337c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f336b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f336b = null;
                }
            }

            public a a() {
                return new a(this.f335a, this.f336b, this.f337c, this.f338d);
            }

            public C0010a b(int i) {
                this.f337c = i;
                return this;
            }

            public C0010a c(int i) {
                this.f338d = i;
                return this;
            }

            public C0010a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f336b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f330a = textPaint;
            this.f331b = textDirectionHeuristic;
            this.f332c = i;
            this.f333d = i2;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.f334e;
            if (params != null) {
                return params.equals(aVar.f334e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f332c != aVar.b() || this.f333d != aVar.c())) || this.f330a.getTextSize() != aVar.e().getTextSize() || this.f330a.getTextScaleX() != aVar.e().getTextScaleX() || this.f330a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f330a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f330a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f330a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f330a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f330a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f330a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f330a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f332c;
        }

        public int c() {
            return this.f333d;
        }

        public TextDirectionHeuristic d() {
            return this.f331b;
        }

        public TextPaint e() {
            return this.f330a;
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
            return Build.VERSION.SDK_INT < 18 || this.f331b == aVar.d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return a.h.j.c.b(Float.valueOf(this.f330a.getTextSize()), Float.valueOf(this.f330a.getTextScaleX()), Float.valueOf(this.f330a.getTextSkewX()), Float.valueOf(this.f330a.getLetterSpacing()), Integer.valueOf(this.f330a.getFlags()), this.f330a.getTextLocales(), this.f330a.getTypeface(), Boolean.valueOf(this.f330a.isElegantTextHeight()), this.f331b, Integer.valueOf(this.f332c), Integer.valueOf(this.f333d));
            } else if (i >= 21) {
                return a.h.j.c.b(Float.valueOf(this.f330a.getTextSize()), Float.valueOf(this.f330a.getTextScaleX()), Float.valueOf(this.f330a.getTextSkewX()), Float.valueOf(this.f330a.getLetterSpacing()), Integer.valueOf(this.f330a.getFlags()), this.f330a.getTextLocale(), this.f330a.getTypeface(), Boolean.valueOf(this.f330a.isElegantTextHeight()), this.f331b, Integer.valueOf(this.f332c), Integer.valueOf(this.f333d));
            } else if (i >= 18) {
                return a.h.j.c.b(Float.valueOf(this.f330a.getTextSize()), Float.valueOf(this.f330a.getTextScaleX()), Float.valueOf(this.f330a.getTextSkewX()), Integer.valueOf(this.f330a.getFlags()), this.f330a.getTextLocale(), this.f330a.getTypeface(), this.f331b, Integer.valueOf(this.f332c), Integer.valueOf(this.f333d));
            } else if (i >= 17) {
                return a.h.j.c.b(Float.valueOf(this.f330a.getTextSize()), Float.valueOf(this.f330a.getTextScaleX()), Float.valueOf(this.f330a.getTextSkewX()), Integer.valueOf(this.f330a.getFlags()), this.f330a.getTextLocale(), this.f330a.getTypeface(), this.f331b, Integer.valueOf(this.f332c), Integer.valueOf(this.f333d));
            } else {
                return a.h.j.c.b(Float.valueOf(this.f330a.getTextSize()), Float.valueOf(this.f330a.getTextScaleX()), Float.valueOf(this.f330a.getTextSkewX()), Integer.valueOf(this.f330a.getFlags()), this.f330a.getTypeface(), this.f331b, Integer.valueOf(this.f332c), Integer.valueOf(this.f333d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f330a.getTextSize());
            sb.append(", textScaleX=" + this.f330a.getTextScaleX());
            sb.append(", textSkewX=" + this.f330a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f330a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f330a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f330a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f330a.getTextLocale());
            }
            sb.append(", typeface=" + this.f330a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f330a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f331b);
            sb.append(", breakStrategy=" + this.f332c);
            sb.append(", hyphenationFrequency=" + this.f333d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f330a = params.getTextPaint();
            this.f331b = params.getTextDirection();
            this.f332c = params.getBreakStrategy();
            this.f333d = params.getHyphenationFrequency();
        }
    }
}
