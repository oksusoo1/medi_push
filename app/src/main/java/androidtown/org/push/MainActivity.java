package androidtown.org.push;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

import static java.sql.DriverManager.println;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FirebaseMessaging.getInstance().subscribeToTopic("notice");

        WebView WebView01 = (WebView) findViewById(R.id.webView01);
        WebView01.setWebViewClient(new WebViewClient());

        WebSettings webSettings = WebView01.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //WebView01.loadUrl("http://spboxmnger.iptime.org:3000/med_getTState?res_no=RESP0001");
        WebView01.loadUrl("http://spbox.iptime.org:5000/med_getTState?res_no=RESPM20002");


    }

    public void onButton2Clicked(View v) {
        String regId = FirebaseInstanceId.getInstance().getToken();
        println("등록 ID : " + regId);
        Log.i("token"," : "+regId);

        //sendToMobileServer(regId);
    }

    public void onButton3Clicked(View v) {
        String regId = FirebaseInstanceId.getInstance().getToken();
        println("등록 ID : " + regId);
        Log.i("token"," : "+regId);

        //sendToMobileServer(regId);
    }


}
