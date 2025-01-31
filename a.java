package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/clueval.englishsentence.tamil/dex-files/0.dex */
public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/clueval.englishsentence.tamil/dex-files/2.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {
        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                N2(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i5 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                W1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i5 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                C4(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i5 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                p4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i5 != 6) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            } else {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                N4(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void C4(Bundle bundle);

    void N2(int i5, Bundle bundle);

    void N4(int i5, Uri uri, boolean z4, Bundle bundle);

    void W1(String str, Bundle bundle);

    void p4(String str, Bundle bundle);
}
