package ensomerge.in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    private WebView web;
    private TextView B2B, B2B_TL, TCN_Enso, TV, Eset, TCN, Attandance, Ticket_Tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        web = findViewById(R.id.webview);

        B2B = findViewById(R.id.B2B);
        B2B_TL = findViewById(R.id.B2B_TL);
        TCN_Enso = findViewById(R.id.TCN_Enso);
        TV = findViewById(R.id.TV);
        Eset = findViewById(R.id.Eset);
        TCN = findViewById(R.id.TCN);
        Attandance = findViewById(R.id.Attandance);
        Ticket_Tracker = findViewById(R.id.Ticket_Tracker);


        web.loadUrl("https://wfm.ensomerge.com/");
        web.setWebViewClient(new WebViewClient());
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getCacheMode();
        B2B.setBackground(getDrawable(R.drawable.background));

        B2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.background));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));
            }
        });

        B2B_TL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.background));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        TCN_Enso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/ensomerge/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.background));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/ensomerge/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.background));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        Eset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/ensomerge/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.background));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        TCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/tcn/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.background));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        Attandance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/hr/present.php");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.background));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.shape));

            }
        });

        Ticket_Tracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://wfm.ensomerge.com/ticket/");
                web.setWebViewClient(new WebViewClient());
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.getCacheMode();
                B2B.setBackground(getDrawable(R.drawable.shape));
                B2B_TL.setBackground(getDrawable(R.drawable.shape));
                TCN_Enso.setBackground(getDrawable(R.drawable.shape));
                TV.setBackground(getDrawable(R.drawable.shape));
                Eset.setBackground(getDrawable(R.drawable.shape));
                TCN.setBackground(getDrawable(R.drawable.shape));
                Attandance.setBackground(getDrawable(R.drawable.shape));
                Ticket_Tracker.setBackground(getDrawable(R.drawable.background));

            }
        });
    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()){
            web.goBack();
        }
        else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}