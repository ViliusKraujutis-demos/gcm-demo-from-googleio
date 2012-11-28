/**
 * 
 */

package lt.andro.hellogcm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

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
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onMessage(android.content.Context,
     * android.content.Intent)
     */
    @Override
    protected void onMessage(Context arg0, Intent content) {
        Log.d(TAG, "onMessage: " + content);
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onRegistered(android.content.Context,
     * java.lang.String)
     */
    @Override
    protected void onRegistered(Context arg0, String registrationId) {
        Log.d(TAG, "onRegistered: " + registrationId);
    }

    /*
     * (non-Javadoc)
     * @see com.google.android.gcm.GCMBaseIntentService#onUnregistered(android.content.Context,
     * java.lang.String)
     */
    @Override
    protected void onUnregistered(Context arg0, String content) {
        Log.d(TAG, "onUnregistered: " + content);
    }

}
