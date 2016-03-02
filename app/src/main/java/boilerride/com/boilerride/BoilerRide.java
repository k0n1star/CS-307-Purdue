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
<<<<<<< HEAD
<<<<<<< HEAD
    public static Firebase myFb;
=======
=======
>>>>>>> parent of 31fd351... login and creating account added
    Firebase myFirebase;

>>>>>>> parent of 31fd351... login and creating account added
    @Override
    public void onCreate()
    {
        super.onCreate();
<<<<<<< HEAD
<<<<<<< HEAD
        /* Initialize Firebase */
        Firebase.setAndroidContext(this);
        myFb  = new Firebase("https://luminous-torch-1510.firebaseio.com/");
        /* Enable disk persistence  */
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
        //locationService = new LocationService(this);
        //locationService.connect();
=======
=======
>>>>>>> parent of 31fd351... login and creating account added
        myFirebase = new Firebase("https://luminous-torch-1510.firebaseio.com/");
        myFirebase.setAndroidContext(this);
        myCookieStore = new PersistentCookieStore(this);
        locationService = new LocationService(this);
        locationService.connect();
<<<<<<< HEAD
>>>>>>> parent of 31fd351... login and creating account added
=======
>>>>>>> parent of 31fd351... login and creating account added
    }

}
