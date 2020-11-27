package com.example.mapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PostasActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_antiguo);
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
        LatLng ttio = new LatLng(-13.532402, -71.959752);
        LatLng zarzuela = new LatLng(-13.531612, -71.982787);
        LatLng sansebas = new LatLng(-13.532585, -71.929552);
        LatLng wanchaq  = new LatLng(-13.522609, -71.970576);
        LatLng belenpampa = new LatLng(-13.525517, -71.978813);
        LatLng tupac = new LatLng(-13.538486, -71.911232);

        mMap.addMarker(new MarkerOptions().position(ttio).title("Posta de Ttio"));
        mMap.addMarker(new MarkerOptions().position(zarzuela).title("Centro de salud de Zarzuela alta"));
        mMap.addMarker(new MarkerOptions().position(sansebas).title("Centro de salud San Sebastian"));
        mMap.addMarker(new MarkerOptions().position(wanchaq).title("Centro de salud Clas Wanchaq"));
        mMap.addMarker(new MarkerOptions().position(belenpampa).title("Centro de salud Belenpampa"));
        mMap.addMarker(new MarkerOptions().position(tupac).title("Centro de salud Tupac Amaru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ttio));

    }
}
