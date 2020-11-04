package com.tempmail;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.e;
import androidx.databinding.i.b.a;
import com.tempmail.m.b;
import com.tempmail.m.b0;
import com.tempmail.m.b1;
import com.tempmail.m.d;
import com.tempmail.m.d0;
import com.tempmail.m.d1;
import com.tempmail.m.f;
import com.tempmail.m.f0;
import com.tempmail.m.f1;
import com.tempmail.m.h;
import com.tempmail.m.h0;
import com.tempmail.m.h1;
import com.tempmail.m.j;
import com.tempmail.m.j0;
import com.tempmail.m.j1;
import com.tempmail.m.l;
import com.tempmail.m.l0;
import com.tempmail.m.n;
import com.tempmail.m.n0;
import com.tempmail.m.p;
import com.tempmail.m.p0;
import com.tempmail.m.r;
import com.tempmail.m.r0;
import com.tempmail.m.t;
import com.tempmail.m.t0;
import com.tempmail.m.v;
import com.tempmail.m.v0;
import com.tempmail.m.x;
import com.tempmail.m.x0;
import com.tempmail.m.z;
import com.tempmail.m.z0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class g extends c {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f12310a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(31);
        f12310a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_main, 1);
        f12310a.put(R.layout.activity_scan, 2);
        f12310a.put(R.layout.activity_splash, 3);
        f12310a.put(R.layout.app_bar_main, 4);
        f12310a.put(R.layout.content_main, 5);
        f12310a.put(R.layout.dialog_ad_layout, 6);
        f12310a.put(R.layout.dialog_fragment_download, 7);
        f12310a.put(R.layout.dialog_rewarded_video, 8);
        f12310a.put(R.layout.download_item, 9);
        f12310a.put(R.layout.fragment_ad_dialog, 10);
        f12310a.put(R.layout.fragment_ad_premium, 11);
        f12310a.put(R.layout.fragment_change_email, 12);
        f12310a.put(R.layout.fragment_dialog_premium, 13);
        f12310a.put(R.layout.fragment_email_address, 14);
        f12310a.put(R.layout.fragment_help_improve_dialog_new, 15);
        f12310a.put(R.layout.fragment_inbox, 16);
        f12310a.put(R.layout.fragment_mail, 17);
        f12310a.put(R.layout.fragment_premium, 18);
        f12310a.put(R.layout.fragment_qr_code, 19);
        f12310a.put(R.layout.fragment_rating_dialog_new, 20);
        f12310a.put(R.layout.fragment_rewarded_ad_dialog, 21);
        f12310a.put(R.layout.fragment_switch_email, 22);
        f12310a.put(R.layout.fragment_tell_what_think_dialog, 23);
        f12310a.put(R.layout.fragment_tell_what_think_dialog_new, 24);
        f12310a.put(R.layout.fragment_update_app_version_dialog, 25);
        f12310a.put(R.layout.item_email_address, 26);
        f12310a.put(R.layout.item_email_address_expired, 27);
        f12310a.put(R.layout.item_mail, 28);
        f12310a.put(R.layout.spinner_item_child, 29);
        f12310a.put(R.layout.spinner_item_group, 30);
        f12310a.put(R.layout.toolbar_content, 31);
    }

    public List<c> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new a());
        return arrayList;
    }

    public ViewDataBinding b(e eVar, View view, int i) {
        int i2 = f12310a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/activity_main_0".equals(tag)) {
                        return new b(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_scan_0".equals(tag)) {
                        return new d(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_scan is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_splash_0".equals(tag)) {
                        return new f(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
                case 4:
                    if ("layout/app_bar_main_0".equals(tag)) {
                        return new h(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
                case 5:
                    if ("layout/content_main_0".equals(tag)) {
                        return new j(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
                case 6:
                    if ("layout/dialog_ad_layout_0".equals(tag)) {
                        return new l(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_ad_layout is invalid. Received: " + tag);
                case 7:
                    if ("layout/dialog_fragment_download_0".equals(tag)) {
                        return new n(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_fragment_download is invalid. Received: " + tag);
                case 8:
                    if ("layout/dialog_rewarded_video_0".equals(tag)) {
                        return new p(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_rewarded_video is invalid. Received: " + tag);
                case 9:
                    if ("layout/download_item_0".equals(tag)) {
                        return new r(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for download_item is invalid. Received: " + tag);
                case 10:
                    if ("layout/fragment_ad_dialog_0".equals(tag)) {
                        return new t(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_ad_dialog is invalid. Received: " + tag);
                case 11:
                    if ("layout/fragment_ad_premium_0".equals(tag)) {
                        return new v(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_ad_premium is invalid. Received: " + tag);
                case 12:
                    if ("layout/fragment_change_email_0".equals(tag)) {
                        return new x(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_change_email is invalid. Received: " + tag);
                case 13:
                    if ("layout/fragment_dialog_premium_0".equals(tag)) {
                        return new z(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_dialog_premium is invalid. Received: " + tag);
                case 14:
                    if ("layout/fragment_email_address_0".equals(tag)) {
                        return new b0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_email_address is invalid. Received: " + tag);
                case 15:
                    if ("layout/fragment_help_improve_dialog_new_0".equals(tag)) {
                        return new d0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_help_improve_dialog_new is invalid. Received: " + tag);
                case 16:
                    if ("layout/fragment_inbox_0".equals(tag)) {
                        return new f0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_inbox is invalid. Received: " + tag);
                case 17:
                    if ("layout/fragment_mail_0".equals(tag)) {
                        return new h0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_mail is invalid. Received: " + tag);
                case 18:
                    if ("layout/fragment_premium_0".equals(tag)) {
                        return new j0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_premium is invalid. Received: " + tag);
                case 19:
                    if ("layout/fragment_qr_code_0".equals(tag)) {
                        return new l0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_qr_code is invalid. Received: " + tag);
                case 20:
                    if ("layout/fragment_rating_dialog_new_0".equals(tag)) {
                        return new n0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_rating_dialog_new is invalid. Received: " + tag);
                case 21:
                    if ("layout/fragment_rewarded_ad_dialog_0".equals(tag)) {
                        return new p0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_rewarded_ad_dialog is invalid. Received: " + tag);
                case 22:
                    if ("layout/fragment_switch_email_0".equals(tag)) {
                        return new r0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_switch_email is invalid. Received: " + tag);
                case 23:
                    if ("layout/fragment_tell_what_think_dialog_0".equals(tag)) {
                        return new t0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_tell_what_think_dialog is invalid. Received: " + tag);
                case 24:
                    if ("layout/fragment_tell_what_think_dialog_new_0".equals(tag)) {
                        return new v0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_tell_what_think_dialog_new is invalid. Received: " + tag);
                case 25:
                    if ("layout/fragment_update_app_version_dialog_0".equals(tag)) {
                        return new x0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_update_app_version_dialog is invalid. Received: " + tag);
                case 26:
                    if ("layout/item_email_address_0".equals(tag)) {
                        return new z0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for item_email_address is invalid. Received: " + tag);
                case 27:
                    if ("layout/item_email_address_expired_0".equals(tag)) {
                        return new b1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for item_email_address_expired is invalid. Received: " + tag);
                case 28:
                    if ("layout/item_mail_0".equals(tag)) {
                        return new d1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for item_mail is invalid. Received: " + tag);
                case 29:
                    if ("layout/spinner_item_child_0".equals(tag)) {
                        return new f1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for spinner_item_child is invalid. Received: " + tag);
                case 30:
                    if ("layout/spinner_item_group_0".equals(tag)) {
                        return new h1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for spinner_item_group is invalid. Received: " + tag);
                case 31:
                    if ("layout/toolbar_content_0".equals(tag)) {
                        return new j1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for toolbar_content is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f12310a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
