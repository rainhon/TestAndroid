package top.rainbowl.testandroid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void sendMessage(View view) {
        Log.d("Test", "DDDD");
        Context context = getApplicationContext();
        Intent intent = new Intent(this, WebSocketService.class); // Build the intent for the service
        context.startForegroundService(intent);
    }
}