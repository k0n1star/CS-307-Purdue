package boilerride.com.boilerride;

import android.app.Application;

import com.firebase.client.Firebase;
import com.loopj.android.http.PersistentCookieStore;
/**
 * Created by nadeemmahmood on 2/27/16.
 */
public class BoilerRide extends Application {

    public static PersistentCookieStore myCookieStore;
    public static LocationService locationService;
    Firebase myFirebase;

    @Override
    public void onCreate()
    {
        super.onCreate();
        myFirebase = new Firebase("https://luminous-torch-1510.firebaseio.com/");
        myFirebase.setAndroidContext(this);
        myCookieStore = new PersistentCookieStore(this);
        locationService = new LocationService(this);
        locationService.connect();
    }

}
