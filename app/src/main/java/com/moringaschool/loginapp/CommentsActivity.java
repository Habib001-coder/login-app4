package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
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
import retrofit2.Callback;
import retrofit2.Response;

public class CommentsActivity extends AppCompatActivity {
    @BindView(R.id.progresBar) ProgressBar mProgressBar;
    @BindView(R.id.RecyclerViewItem) RecyclerView mChapterRecyclerView;
    @BindView(R.id.Errormessage) TextView mErrorMessage;

    private ChaptersAdapter mAdapter;
    private String mChapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        ButterKnife.bind(this);

        getQuranChapters();
    }
public void getQuranChapters(){
    QuranApi myClient = QuranClient.getClient();
   Call<Chapters> call = myClient.getChapters("en");

   call.enqueue(new Callback<Chapters>() {
       @Override
       public void onResponse(Call<Chapters> call, Response<Chapters> response) {
           hideProgressBar();
           Log.e("TAG","Response " + response );
           if (response.isSuccessful()) ;
//           mChapter = response.body().getResult();
//           mAdapter = new ChaptersAdapter(CommentsActivity.this.mChapter);
//           mChapterRecyclerView.setAdapter(mAdapter);
//           RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CommentsActivity.this);
//           mChapterRecyclerView.setLayoutManager(layoutManager);
//           mChapterRecyclerView.setHasFixedSize(true);
//
//           showQuranChapter();
       }

//       else{
//           showFailureMessage();
//       }


       @Override
       public void onFailure(Call<Chapters> call, Throwable t) {
//       showFailureMessage();

           Log.e("TAG", "ResponseFail " + t.getMessage());
       }
   });

}
   public void hideProgressBar(){
    mProgressBar.setVisibility(View.GONE);
}
    public void showQuranChapter(){
    mChapterRecyclerView.setVisibility(View.VISIBLE);
    }

    public void showFailureMessage(){
     mErrorMessage.setText("Check Your Internet connection");
     mErrorMessage.setVisibility(View.VISIBLE);

}
    }
