package com.secuso.privacyfriendlycodescanner.qrscanner.ui.activities.generator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.secuso.privacyfriendlycodescanner.qrscanner.R;
import com.secuso.privacyfriendlycodescanner.qrscanner.ui.helpers.GeneratorListAdapter;


public class QrGeneratorOverviewActivity extends AppCompatActivity {
    ListView listView;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_generator);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.list_view);

        String[] generator = getResources().getStringArray(R.array.generator_array);
        Integer[] icons = new Integer[]{
                R.drawable.ic_baseline_subject_24dp,
                R.drawable.ic_email_accent_24dp,
                R.drawable.ic_baseline_public_24dp,
                R.drawable.ic_phone_accent_24dp,
                R.drawable.ic_baseline_sms_24dp,
                R.drawable.ic_baseline_place_24dp,
                R.drawable.ic_person_accent_24dp,
                R.drawable.ic_person_accent_24dp,
                R.drawable.ic_baseline_wifi_24dp,
                R.drawable.ic_person_accent_24dp,
                R.drawable.ic_baseline_shopping_cart_24dp};

        GeneratorListAdapter adapter = new GeneratorListAdapter(this, generator, icons);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(QrGeneratorOverviewActivity.this, TextEnterActivity.class);
                        break;
                    case 1:
                        intent = new Intent(QrGeneratorOverviewActivity.this, MailEnterActivity.class);
                        break;
                    case 2:
                        intent = new Intent(QrGeneratorOverviewActivity.this, UrlEnterActivity.class);
                        break;
                    case 3:
                        intent = new Intent(QrGeneratorOverviewActivity.this, TelEnterActivity.class);
                        break;
                    case 4:
                        intent = new Intent(QrGeneratorOverviewActivity.this, SmsEnterActivity.class);
                        break;
                    case 5:
                        intent = new Intent(QrGeneratorOverviewActivity.this, GeoLocationEnterActivity.class);
                        break;
                    case 6:
                        intent = new Intent(QrGeneratorOverviewActivity.this, MeCardEnterActivity.class);
                        break;
                    case 7:
                        intent = new Intent(QrGeneratorOverviewActivity.this, BizCardEnterActivity.class);
                        break;
                    case 8:
                        intent = new Intent(QrGeneratorOverviewActivity.this, WifiEnterActivity.class);
                        break;
                    case 9:
                        intent = new Intent(QrGeneratorOverviewActivity.this, VcardEnterActivity.class);
                        break;
                    case 10:
                        intent = new Intent(QrGeneratorOverviewActivity.this, MarketEnterActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }


}

