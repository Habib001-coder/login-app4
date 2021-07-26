package com.moringaschool.loginapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.loginapp.R;
import com.moringaschool.loginapp.models.Chapter;
import com.moringaschool.loginapp.services.QuranApi;
import com.moringaschool.loginapp.models.Chapter;

import java.text.BreakIterator;
import java.util.List;

import javax.xml.transform.Result;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.QuranChaptersViewHolder> {
    private Context mContext;
    private List<Chapter> mChapter;

    public ChaptersAdapter(Context context, List<Chapter> mChapters) {
        this.mContext = context;
        this.mChapter = mChapters;


    }

    @Override
    public QuranChaptersViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quran_chapters_items,parent,false);
//        QuranChaptersViewHolder ViewHolder = new QuranChaptersViewHolder(v);

        return new QuranChaptersViewHolder(view);
    }

    @Override
    public void onBindViewHolder( QuranChaptersViewHolder holder, int position) {
    holder.bindQuranChapter.setText("Developed by:"+ mChapter.get(position));

    }

    @Override
    public int getItemCount() {
        return mChapter.size();

    }



    public class QuranChaptersViewHolder extends RecyclerView.ViewHolder {
        public BreakIterator bindQuranChapter;
//              TextView mCha
        @BindView(R.id.progresBar) ImageView mQuranImageView;
        @BindView(R.id.quran_chapterTextView)TextView mQuranChapter;
        @BindView(R.id.revelation_place) TextView mRevelationPlace;
        @BindView(R.id.revelation_order) TextView mRevalationOrder;
        @BindView(R.id.name_simple) TextView mNameSimple;
        @BindView(R.id.name_complex) TextView mNameCompex;
        @BindView(R.id.bismillah_pre) TextView mBismillahi;
        @BindView(R.id.name_arabic) TextView mArabicname;
        @BindView(R.id.verses_count) TextView mVerseCount;
        @BindView(R.id.pages) TextView mQuranPages;
        @BindView(R.id.translated_name) TextView mTranslatedName;

//                private Context mContext;
        public QuranChaptersViewHolder(View itemView) {
            super(itemView);
//            ButterKnife.bind(this.itemView);
//            mChapter = itemView.getContext();
        }
    }


        }
//       public void bindQuranChapter (Chapter chapters){
//            mRevelationPlace.setText( chapters.getRevelationPlace());
//            mRevalationOrder.setText(  chapters.getRevelationOrder());
//            mNameSimple.setText(chapters.getNameSimple());
//            mNameCompex.setText(chapters.getNameComplex());
//            mBismillahi.setText(chapters.getBismillahPre().toString());
//            mArabicname.setText(chapters.getNameArabic());
//            mVerseCount.setText(chapters.getVersesCount());
//            mQuranPages.setText(chapters.getPages().toString());
//            mTranslatedName.setText(chapters.getTranslatedName().toString());
//       }
//    }
//}
