package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    ArrayList <MascotasDto> mascotas;
    MascotasAdaptador adaptador;
    RecyclerView listmascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);



        CardView mCardView;
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);

          mascotas= new ArrayList<MascotasDto>();
         listmascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listmascotas.setLayoutManager(llm);
        inicializarListMascotas();
        inicializarAdaptador();

        return v;
    }
    public void inicializarAdaptador(){
                adaptador = new MascotasAdaptador(mascotas);
        listmascotas.setAdapter(adaptador);

    }

    public void inicializarListMascotas(){
        mascotas= new ArrayList<MascotasDto>();
        // mascotas.add(new MascotasDto(R.id.petImg,"Ulises",R.id.boneImg,1,R.id.boneLikeImg));
        // mascotas.add(new MascotasDto(R.id.petImg,"Malena",R.id.boneImg,1,R.id.boneLikeImg));
        // mascotas.add(new MascotasDto(R.id.petImg,"Lola",R.id.boneImg,1,R.id.boneLikeImg));
        // mascotas.add(new MascotasDto(R.id.petImg,"Morita",R.id.boneImg,1,R.id.boneLikeImg));

        mascotas.add(new MascotasDto(R.drawable.pet48,"Ulises",R.drawable.bonesvg,"0",R.mipmap.bonelike48));
        mascotas.add(new MascotasDto(R.drawable.pet48,"Malena",R.drawable.bonesvg,"0",R.mipmap.bonelike48));
        mascotas.add(new MascotasDto(R.drawable.pet48,"Lola",R.drawable.bonesvg,"0",R.mipmap.bonelike48));
        mascotas.add(new MascotasDto(R.drawable.pet48,"Morita",R.drawable.bonesvg,"0",R.mipmap.bonelike48));

    }
}
