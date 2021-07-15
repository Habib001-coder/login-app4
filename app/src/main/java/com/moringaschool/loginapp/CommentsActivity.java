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

import org.w3c.dom.Text;

import java.util.List;

import javax.xml.transform.Result;

import butterknife.BindView;

public class CommentsActivity extends AppCompatActivity {
    @BindView(R.id.progresBar) ProgressBar mprogresBar;
    @BindView(R.id.RecyclerViewItem) RecyclerView mRecyclerViewItem;
    @BindView(R.id.Errormessage) TextView mErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

    }
        private ChaptersAdapter mAdapter;
        private List<Result> mChapter;



    }

