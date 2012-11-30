
package lt.andro.hellogcm;

import android.content.Context;
import android.os.Vibrator;

/**
 * Need to add these permisions {@code <uses-permission android:name="android.permission.VIBRATE"/>}
 * 
 * @author viliuskraujutis
 */
public class AlusVibration {

    /**
     * @see AlusVibration
     * 
     * @param context
     */
    public static void vibrate(Context context) {

        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);

        // Vibrate for 300 milliseconds
        v.vibrate(30);
    }
}
