package boilerride.com.boilerride;

import android.app.Application;

import com.firebase.client.Firebase;
/**
 * Created by nadeemmahmood on 2/27/16.
 */
public class BoilerRide extends android.app.Application {

    public static LocationService locationService;
    public static Firebase myFb;
    @Override
    public void onCreate()
    {
        super.onCreate();
        /* Initialize Firebase */
        Firebase.setAndroidContext(this);
        myFb  = new Firebase("https://luminous-torch-1510.firebaseio.com/");
        /* Enable disk persistence  */
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
        //locationService = new LocationService(this);
        //locationService.connect();
    }

}
