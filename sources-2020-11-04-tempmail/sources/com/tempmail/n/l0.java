package com.tempmail.n;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.h.a;
import com.tempmail.R;

/* compiled from: FragmentPremiumBindingImpl */
public class l0 extends k0 {
    private static final ViewDataBinding.d o1 = null;
    private static final SparseIntArray p1;
    private final NestedScrollView m1;
    private long n1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p1 = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 4);
        p1.put(R.id.ivClose, 5);
        p1.put(R.id.ivLogo, 6);
        p1.put(R.id.tvTrialTitle, 7);
        p1.put(R.id.tvTitle, 8);
        p1.put(R.id.tvChoose, 9);
        p1.put(R.id.btnOneWeek, 10);
        p1.put(R.id.tvFirstFakeTextWeek, 11);
        p1.put(R.id.tvSecondFakeTextWeek, 12);
        p1.put(R.id.tvPeriodOneWeek, 13);
        p1.put(R.id.tvTotalOneWeek, 14);
        p1.put(R.id.tvPriceOneWeek, 15);
        p1.put(R.id.line4, 16);
        p1.put(R.id.btnOneMonth, 17);
        p1.put(R.id.tvFirstFakeText, 18);
        p1.put(R.id.tvSecondFakeText, 19);
        p1.put(R.id.tvPeriodMonth, 20);
        p1.put(R.id.tvTotalOneMonth, 21);
        p1.put(R.id.tvPriceMonth, 22);
        p1.put(R.id.line6, 23);
        p1.put(R.id.tvDiscountOneMonth, 24);
        p1.put(R.id.btnThreeMonth, 25);
        p1.put(R.id.tvPeriodThreeMonth, 26);
        p1.put(R.id.tvPriceThreePerMonth, 27);
        p1.put(R.id.tvTotalThreeMonth, 28);
        p1.put(R.id.tvPriceThreeMonth, 29);
        p1.put(R.id.line5, 30);
        p1.put(R.id.tvDiscountThreeMonth, 31);
        p1.put(R.id.btnSixMonth, 32);
        p1.put(R.id.tvPeriodSixMonth, 33);
        p1.put(R.id.tvPriceSixPerMonth, 34);
        p1.put(R.id.tvTotalSixMonth, 35);
        p1.put(R.id.tvPriceSixMonth, 36);
        p1.put(R.id.line2, 37);
        p1.put(R.id.tvDiscountSixMonth, 38);
        p1.put(R.id.btnYear, 39);
        p1.put(R.id.tvPeriodYear, 40);
        p1.put(R.id.tvPriceYearPerMonth, 41);
        p1.put(R.id.tvTotalYear, 42);
        p1.put(R.id.tvPriceYear, 43);
        p1.put(R.id.line3, 44);
        p1.put(R.id.tvDiscountYear, 45);
        p1.put(R.id.btnOneWeekSecond, 46);
        p1.put(R.id.rbWeek, 47);
        p1.put(R.id.tvPeriodWeekSecond, 48);
        p1.put(R.id.tvPriceWeekSecond, 49);
        p1.put(R.id.btnOneMonthSecond, 50);
        p1.put(R.id.ivDiscountOneMonthSecond, 51);
        p1.put(R.id.tvDiscountOneMonthSecond, 52);
        p1.put(R.id.rb_month, 53);
        p1.put(R.id.tvPeriodMonthSecond, 54);
        p1.put(R.id.tvPriceMonthSecond, 55);
        p1.put(R.id.btnThreeMonthSecond, 56);
        p1.put(R.id.ivDiscountThreeMonthSecond, 57);
        p1.put(R.id.rbThreeMonth, 58);
        p1.put(R.id.tvPriceThreeMonthSecond, 59);
        p1.put(R.id.tvDiscountThreeMonthSecond, 60);
        p1.put(R.id.tvPeriodThreeMonthSecond, 61);
        p1.put(R.id.btnSixMonthSecond, 62);
        p1.put(R.id.ivDiscountSixMonthSecond, 63);
        p1.put(R.id.rb_six_month, 64);
        p1.put(R.id.tvPriceSixMonthSecond, 65);
        p1.put(R.id.tvDiscountSixMonthSecond, 66);
        p1.put(R.id.tvPeriodSixMonthSecond, 67);
        p1.put(R.id.btnYearSecond, 68);
        p1.put(R.id.ivDiscountYearSecond, 69);
        p1.put(R.id.rb_year, 70);
        p1.put(R.id.tvPriceYearSecond, 71);
        p1.put(R.id.tvPeriodYearSecond, 72);
        p1.put(R.id.tvDiscountYearSecond, 73);
        p1.put(R.id.btnFirst, 74);
        p1.put(R.id.lineLeft, 75);
        p1.put(R.id.tvOr, 76);
        p1.put(R.id.lineRight, 77);
        p1.put(R.id.orGroup, 78);
        p1.put(R.id.tvTrialTip, 79);
        p1.put(R.id.btnSecond, 80);
        p1.put(R.id.tvWhyPremium, 81);
        p1.put(R.id.ivCheckOne, 82);
        p1.put(R.id.tvReasonOne, 83);
        p1.put(R.id.ivCheckTwo, 84);
        p1.put(R.id.ivCheckThree, 85);
        p1.put(R.id.ivCheckFour, 86);
        p1.put(R.id.ivCheckFive, 87);
        p1.put(R.id.tvReasonFive, 88);
        p1.put(R.id.ivCheckSix, 89);
        p1.put(R.id.tvReasonSix, 90);
        p1.put(R.id.ivCheckSeven, 91);
        p1.put(R.id.tvReasonSeven, 92);
        p1.put(R.id.tvTos, 93);
        p1.put(R.id.bottomLine, 94);
        p1.put(R.id.tvRestorePurchase, 95);
        p1.put(R.id.centerGuideline, 96);
        p1.put(R.id.rightGuidelineWhyPremium, 97);
        p1.put(R.id.leftGuideLineWhyPremium, 98);
        p1.put(R.id.leftGuideLine, 99);
        p1.put(R.id.rightGuideLine, 100);
    }

    public l0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 101, o1, p1));
    }

    /* access modifiers changed from: protected */
    public void g() {
        long j;
        int i;
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        Resources resources3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.n1;
            this.n1 = 0;
        }
        int i4 = ((j & 1) > 0 ? 1 : ((j & 1) == 0 ? 0 : -1));
        if (!(i4 == 0 || i4 == 0)) {
            if (com.tempmail.utils.e.Q()) {
                j3 = j | 4 | 16;
                j2 = 64;
            } else {
                j3 = j | 2 | 8;
                j2 = 32;
            }
            j = j3 | j2;
        }
        if ((j & 1) != 0) {
            TextView textView = this.T0;
            if (com.tempmail.utils.e.Q()) {
                resources = this.T0.getResources();
                i = R.string.premium_10mm_why_line_4;
            } else {
                resources = this.T0.getResources();
                i = R.string.premium_why_line_4;
            }
            a.b(textView, resources.getString(i));
            TextView textView2 = this.X0;
            if (com.tempmail.utils.e.Q()) {
                resources2 = this.X0.getResources();
                i2 = R.string.premium_10mm_why_line_3;
            } else {
                resources2 = this.X0.getResources();
                i2 = R.string.premium_why_line_3;
            }
            a.b(textView2, resources2.getString(i2));
            TextView textView3 = this.Y0;
            if (com.tempmail.utils.e.Q()) {
                resources3 = this.Y0.getResources();
                i3 = R.string.premium_10mm_why_line_2;
            } else {
                resources3 = this.Y0.getResources();
                i3 = R.string.premium_why_line_2;
            }
            a.b(textView3, resources3.getString(i3));
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.n1 != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.n1 = 1;
        }
        v();
    }

    private l0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[94], objArr[74], objArr[17], objArr[50], objArr[10], objArr[46], objArr[80], objArr[32], objArr[62], objArr[25], objArr[56], objArr[39], objArr[68], objArr[96], objArr[4], objArr[87], objArr[86], objArr[82], objArr[91], objArr[89], objArr[85], objArr[84], objArr[5], objArr[51], objArr[63], objArr[57], objArr[69], objArr[6], objArr[99], objArr[98], objArr[37], objArr[44], objArr[16], objArr[30], objArr[23], objArr[75], objArr[77], objArr[78], objArr[53], objArr[64], objArr[58], objArr[47], objArr[70], objArr[100], objArr[97], objArr[9], objArr[24], objArr[52], objArr[38], objArr[66], objArr[31], objArr[60], objArr[45], objArr[73], objArr[18], objArr[11], objArr[76], objArr[20], objArr[54], objArr[13], objArr[33], objArr[67], objArr[26], objArr[61], objArr[48], objArr[40], objArr[72], objArr[22], objArr[55], objArr[15], objArr[36], objArr[65], objArr[34], objArr[29], objArr[59], objArr[27], objArr[49], objArr[43], objArr[41], objArr[71], objArr[88], objArr[3], objArr[83], objArr[92], objArr[90], objArr[2], objArr[1], objArr[95], objArr[19], objArr[12], objArr[8], objArr[93], objArr[21], objArr[14], objArr[35], objArr[28], objArr[42], objArr[79], objArr[7], objArr[81]);
        this.n1 = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.m1 = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        this.T0.setTag((Object) null);
        this.X0.setTag((Object) null);
        this.Y0.setTag((Object) null);
        x(view);
        p();
    }
}
