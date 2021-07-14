package com.moringaschool.loginapp.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.loginapp.R;

import java.util.List;

import javax.xml.transform.Result;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.QuranChaptersViewHolder> {
    private Context mContext;
    private List<Result> mChapters;

    public ChaptersAdapter(Context context, List<Result> mChapters) {
        this.mContext = context;
        this.mChapters = mChapters;
    }

    public class QuranChaptersViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.progresBar) ImageView mQuranImageView;
        @BindView(R.id.quran_chapterTextView)TextView mQuranChapter;
        @BindView(R.id.rev_place) TextView mRevelationPlace;
        @BindView(R.id.rev_order) TextView mRevaltionOrder;
        @BindView(R.id.name_simplex) TextView mNameSimplex;
        @BindView(R.id.name_complex) TextView mNameCompex;
        @BindView(R.id.bismi_pre) TextView mBismillahi;
        @BindView(R.id.name_arabic) TextView mArabicname;
        @BindView(R.id.verses_count) TextView mVerseCount;
        @BindView(R.id.pages) TextView mQuranPages;
        @BindView(R.id.tranlated_name) TextView mTranslatedName;

        private Context mContext;
        public QuranChaptersViewHolder(View itemView){
        super(itemView);
            ButterKnife.bind(this.itemView);
            mContext = itemView.getContext();



        }

    }
}

