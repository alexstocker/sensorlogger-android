package at.html5live.sensorlogger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class cloudService extends Service {
    public cloudService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
