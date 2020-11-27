package com.example.mapas;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ZonasdeRiesgo extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonasde_riesgo);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sanpedro = new LatLng(-13.520604, -71.982902);
        LatLng molino = new LatLng(-13.535595, -71.961629);
        LatLng vinocanchon = new LatLng(-13.543552, -71.887863);
        LatLng sisol = new LatLng(-13.532584, -71.903717);
        LatLng solidaridad = new LatLng(-13.522485, -71.965554);
        mMap.addMarker(new MarkerOptions().position(sanpedro).title("Mercado de San pedro"));
        mMap.addMarker(new MarkerOptions().position(molino).title("Mercado El Molino II"));
        mMap.addMarker(new MarkerOptions().position(vinocanchon).title("Mercado de Vinocanchon"));
        mMap.addMarker(new MarkerOptions().position(sisol).title("Hopital SISOL larapa"));
        mMap.addMarker(new MarkerOptions().position(solidaridad).title("Hospital de solidaridad Wanchaq"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sanpedro));

    }
}