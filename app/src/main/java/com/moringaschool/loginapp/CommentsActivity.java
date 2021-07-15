package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringaschool.loginapp.adapters.ChaptersAdapter;
import com.moringaschool.loginapp.models.Chapters;
import com.moringaschool.loginapp.services.QuranApi;
import com.moringaschool.loginapp.services.QuranClient;

import org.w3c.dom.Text;

import java.util.List;

import javax.xml.transform.Result;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class CommentsActivity extends AppCompatActivity {
    @BindView(R.id.progresBar) ProgressBar mprogresBar;
    @BindView(R.id.RecyclerViewItem) RecyclerView mRecyclerViewItem;
    @BindView(R.id.Errormessage) TextView mErrorMessage;

    private ChaptersAdapter mAdapter;
    private List<Result> mChapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        ButterKnife.bind(this);

        getQuranChapters();
    }

public void getQuranChapters(){
    QuranApi myClient = QuranClient.getClient();
   Call<Chapters> call = myClient.getChapters(Constants.Quran_Com_Api_BASE_URL);


}
    }
