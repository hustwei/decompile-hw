package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import java.util.ArrayList;

/* compiled from: Unknown */
public class gx implements Creator<gy> {
    static void a(gy gyVar, Parcel parcel, int i) {
        int p = b.p(parcel);
        b.b(parcel, 1, gyVar.fS(), false);
        b.c(parcel, 1000, gyVar.getVersionCode());
        b.D(parcel, p);
    }

    public gy[] aX(int i) {
        return new gy[i];
    }

    public gy al(Parcel parcel) {
        int o = a.o(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < o) {
            int n = a.n(parcel);
            switch (a.S(n)) {
                case 1:
                    arrayList = a.c(parcel, n, InvitationEntity.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, n);
                    break;
                default:
                    a.b(parcel, n);
                    break;
            }
        }
        if (parcel.dataPosition() == o) {
            return new gy(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + o, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel x0) {
        return al(x0);
    }

    public /* synthetic */ Object[] newArray(int x0) {
        return aX(x0);
    }
}
