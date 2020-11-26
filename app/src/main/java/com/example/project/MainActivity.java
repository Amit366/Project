package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.project.Fragments.AnimalFragment;
import com.example.project.Fragments.BirdFragment;

import static com.example.project.R.layout.fragment_animal;
import static com.example.project.R.layout.notification_template_part_chronometer;
import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {


    Button abtn ,bbtn;
    LinearLayout layout;
    Boolean play=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abtn=findViewById(R.id.btnanimal);
        bbtn=findViewById(R.id.btnbird);
        layout=findViewById(R.id.lay);
    }

    public void BFrag(View view) {

        BirdFragment birdFragment=new BirdFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.lay, birdFragment);
        transaction.commit();
        if(play){
            bbtn.setBackgroundResource(R.color.colorAccent);
        }
        else{
            bbtn.setBackgroundResource(R.color.colorPrimaryDark);
        }


    }

    public void AFrag(View view) {
        AnimalFragment animalFragment=new AnimalFragment();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.lay,animalFragment);
        transaction.commit();
        if(play){
            abtn.setBackgroundResource(R.color.colorAccent);
        }
        else{
            abtn.setBackgroundResource(R.color.colorPrimaryDark);
        }

    }
}