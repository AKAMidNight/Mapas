package com.example.mapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ClinicasActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_nuevo);
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

        // Add a marker in Sydney and move the camera
        LatLng suiza = new LatLng(-13.526238, -71.945551);
        LatLng pardo = new LatLng(-13.521586, -71.965607);
        LatLng macsalud = new LatLng(-13.524884, -71.955344);
        LatLng virgen = new LatLng(-13.528883, -71.941122);
        LatLng cornejo = new LatLng(-13.528729, -71.93987);
        LatLng ozono = new LatLng(-13.526192, -71.94972);
        mMap.addMarker(new MarkerOptions().position(suiza).title("Clinica Peruano-Suiza"));
        mMap.addMarker(new MarkerOptions().position(pardo).title("Clinica pardo"));
        mMap.addMarker(new MarkerOptions().position(macsalud).title("Clinica MacSalud"));
        mMap.addMarker(new MarkerOptions().position(virgen).title("Clinica Virgen de Guadalupe"));
        mMap.addMarker(new MarkerOptions().position(cornejo).title("Clinica Cornejo"));
        mMap.addMarker(new MarkerOptions().position(ozono).title("Clinica Ozono"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(suiza));

    }
}
