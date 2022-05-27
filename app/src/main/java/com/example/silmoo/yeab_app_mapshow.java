package com.example.silmoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class yeab_app_mapshow extends AppCompatActivity
                                implements OnMapReadyCallback {

    private GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_mapshow);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.yeab_app_mapshow);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        gMap = googleMap;

        //위도 경도 설정해주기, 처음 보여질 화면임.
        LatLng School = new LatLng(37.578039079396376, 126.96761698264326 );

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(School);
        markerOptions.title("배화여자대학교");
        markerOptions.snippet("학교 주변 1KM 식당가 조회");
        gMap.addMarker(markerOptions);

    }
}