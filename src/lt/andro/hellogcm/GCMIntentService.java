/**
 * 
 */

package lt.andro.hellogcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gcm.GCMBaseIntentService;

/**
 * {@link GCMIntentService}<br/>
 * <br/>
 * 
 * @author Vilius Kraujutis
 * @since Nov 29, 2012 12:16:29 AM
 */
public class GCMIntentService extends GCMBaseIntentService {

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onError(android.content.Context,
     * java.lang.String)
     */
    @Override
    protected void onError(Context context, String content) {
        Log.d(TAG, "OnError:" + content);
        AlusVibration.vibrate(context);
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onMessage(android.content.Context,
     * android.content.Intent)
     */
    @Override
    protected void onMessage(Context context, Intent content) {
        AlusVibration.vibrate(context);
        Log.d(TAG, "onMessage: " + content);
        Bundle extras = content.getExtras();
        String name = extras.getString("NAME");
        String text = "Name = " + name;
        Log.d(TAG, text);
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onRegistered(android.content.Context,
     * java.lang.String)
     */
    @Override
    protected void onRegistered(Context context, String registrationId) {
        Log.d(TAG, "onRegistered: " + registrationId);
        AlusVibration.vibrate(context);
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onUnregistered(android.content.Context,
     * java.lang.String)
     */
    @Override
    protected void onUnregistered(Context context, String content) {
        Log.d(TAG, "onUnregistered: " + content);
        AlusVibration.vibrate(context);
    }

}
