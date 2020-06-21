package com.gabut.projection.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class activity_detail extends AppCompatActivity {
    public static String EXTRA_DATA = "extra_data";
    ImageView imgPhoto, imgSkill, imgSkillb, imgSkillc;
    TextView tvName, tvDetail, tvSkill, tvSkillb, tvSkillc, tvDetailSkill, tvDetailSkillb, tvDetailSkillc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgPhoto = findViewById(R.id.img_item_character);
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);

        imgSkill = findViewById(R.id.img_item_skill);
        imgSkillb = findViewById(R.id.img_item_skillb);
        imgSkillc = findViewById(R.id.img_item_skillc);

        tvSkill = findViewById(R.id.tv_skill_name);
        tvSkillb = findViewById(R.id.tv_skill_nameb);
        tvSkillc = findViewById(R.id.tv_skill_namec);

        tvDetailSkill = findViewById(R.id.tv_skill_detail);
        tvDetailSkillb = findViewById(R.id.tv_skill_detailb);
        tvDetailSkillc = findViewById(R.id.tv_skill_detailc);

        Character character = getIntent().getParcelableExtra(EXTRA_DATA);
        Glide.with(imgPhoto.getContext())
                .load(character.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imgPhoto);

        Glide.with(imgSkill.getContext())
                .load(character.getSkillpict())
                .apply(new RequestOptions().override(55,55))
                .into(imgSkill);

        Glide.with(imgSkillb.getContext())
                .load(character.getSkillpictb())
                .apply(new RequestOptions().override(55,55))
                .into(imgSkillb);

        Glide.with(imgSkillc.getContext())
                .load(character.getSkillpictc())
                .apply(new RequestOptions().override(55,55))
                .into(imgSkillc);

        getSupportActionBar().setTitle(character.getName());

        tvName.setText(character.getName());
        tvDetail.setText(character.getDetail());

        tvSkill.setText(character.getSkill());
        tvSkillb.setText(character.getSkillb());
        tvSkillc.setText(character.getSkillc());

        tvDetailSkill.setText(character.getSkilldesc());
        tvDetailSkillb.setText(character.getSkilldescb());
        tvDetailSkillc.setText(character.getSkilldescc());


    }
}
