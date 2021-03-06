package kr.uncode.lifetreechurch.fm_news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import kr.uncode.lifetreechurch.R;
import kr.uncode.lifetreechurch.base.BaseFragment;
import kr.uncode.lifetreechurch.databinding.FmNewsmiddleBinding;
import kr.uncode.lifetreechurch.fm_notice.NoticeFragment;
import kr.uncode.lifetreechurch.utils.MLog;

public class NewMiddleFragment extends BaseFragment {


    FmNewsmiddleBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MLog.d("middle in");
        backKeyShowController(true);
        binding = DataBindingUtil.inflate(inflater, R.layout.fm_newsmiddle,container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.newFamily.setOnClickListener(this::newMem);
        binding.familyNews.setOnClickListener(this::news);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbarController(true);


    }

    private void news(View view) {

        progressON("Loading...");
        replaceFragment(new NoticeFragment(),true);
    }

    private void newMem(View view) {
        progressON("Loading...");
        replaceFragment(new NewMemberFragment(),true);
    }
}
