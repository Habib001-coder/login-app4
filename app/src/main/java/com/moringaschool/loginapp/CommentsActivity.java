package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringaschool.loginapp.adapters.ChaptersAdapter;
import com.moringaschool.loginapp.models.Chapter;
import com.moringaschool.loginapp.models.QuranResponse;
import com.moringaschool.loginapp.services.QuranApi;
import com.moringaschool.loginapp.services.QuranClient;

import java.util.ArrayList;
import java.util.List;

//import butterknife.BindView;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommentsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    ChaptersAdapter adapter;
    List<Chapter> chapterList =new ArrayList<>();


    @BindView(R.id.progresBar) ProgressBar mProgressBar;
    @BindView(R.id.RecyclerViewItem) RecyclerView mChapterRecyclerView;
    @BindView(R.id.Errormessage) TextView mErrorMessage;

    private ChaptersAdapter mAdapter;
    private List<Chapter> mChapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);


        Log.e("TAG","Oncreate comments activity " );


//        ButterKnife.bind(this);
        getQuranChapters();
    }
public void getQuranChapters(){
    QuranApi myClient = QuranClient.getClient();
   Call<QuranResponse> call = myClient.getChapter("en");

   call.enqueue(new Callback<QuranResponse>() {
//       public void onResponse(Call<QuranResponse> call, Response<QuranResponse> response) {
//
//       }

//       @Override
//       public void onFailure(Call<QuranResponse> call, Throwable t) {
//
//       }

       @Override
       public void onResponse(Call<QuranResponse> call, Response<com.moringaschool.loginapp.models.QuranResponse> response) {
//           hideProgressBar();
           Log.e("TAG", "Response " + response);
           if (response.isSuccessful()) {
               mChapter = (List<Chapter>) response.body().getChapters();
               mAdapter = new ChaptersAdapter(CommentsActivity.this,mChapter);
//               mChapterRecyclerView.setAdapter(mAdapter);
               RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CommentsActivity.this);
               mChapterRecyclerView.setLayoutManager(layoutManager);
//               mChapterRecyclerView.setHasFixedSize(true);
               showQuranChapter();
           } else {
               showFailureMessage();
           }
       }

       @Override
       public void onFailure(Call<QuranResponse> call, Throwable t) {
       showFailureMessage();

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
//     mErrorMessage.setText("Check Your Internet connection");
     mErrorMessage.setVisibility(View.VISIBLE);

}
    }
