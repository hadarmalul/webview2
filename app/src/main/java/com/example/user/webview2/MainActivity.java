package com.example.user.webview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
     EditText et1,et2,et3;
     WebView wv; 
    int a,b,c; 
    String st1,st2,st3,stringurl;  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
             et1 = (EditText) findViewById(R.id.et1); 
            et2 = (EditText) findViewById(R.id.et2); 
            et3= (EditText) findViewById(R.id.et3); 
            btn1 = (Button) findViewById(R.id.btn1); 
            btn2 = (Button) findViewById(R.id.btn2); 
            wv = (WebView) findViewById(R.id.wv); 
            wv.getSettings().setJavaScriptEnabled(true); 
            wv.setWebViewClient (new MyWebViewClient());  
    }
    private class MyWebViewClient extends WebViewClient {

        public boolean shouldOverrideurlLoading(WebView wv,String url ){
            wv.loadUrl(url);
            return true;
        }
    }

    public void newclick(View view) {
        st1= et1.getText().toString();
        a= Integer.parseInt(st1);
        st2= et2.getText().toString();
        b= Integer.parseInt(st2);
        st3= et3.getText().toString();
        c= Integer.parseInt(st3);
        stringurl= "https://www.google.co.il/search?ei=hHNQXISFEYLmsAfUxrqACQ&q=";
        stringurl= stringurl+a+"x%5E2%2B"+b+"x%2B"+c+"&oq";
        wv.loadUrl(stringurl);


    }

    public void startclick(View view) {
        et1.setText(" ");
        et2.setText(" ");
        et3.setText(" ");

    }
}
