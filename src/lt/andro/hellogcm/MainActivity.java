
package lt.andro.hellogcm;

import com.google.android.gcm.GCMRegistrar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    private static final String API_KEY = "AIzaSyBgm6Wy37KMJNGbRWXPTP6sdU8sJBxaAsc";
    private static final String SENDER_ID = "575191559332";
    private static final String TAG = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GCMRegistrar.checkDevice(this);
        GCMRegistrar.checkManifest(this);
        final String regId = GCMRegistrar.getRegistrationId(this);
        if (regId.equals("")) {
            GCMRegistrar.register(this, SENDER_ID);
        } else {
            Log.v(TAG, "Already registered: " + regId);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
