package cn.edu.gdmec.android.broadcasttest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Jack on 2017/12/17.
 */

public class AnotherBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText ( context, "received in AnotherBroadcastReceiver",
                Toast.LENGTH_SHORT).show ();
    }
}
