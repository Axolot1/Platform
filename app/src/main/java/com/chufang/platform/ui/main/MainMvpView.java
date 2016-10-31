package com.chufang.platform.ui.main;

import com.chufang.platform.data.model.Ribot;
import com.chufang.platform.ui.base.MvpView;

import java.util.List;


public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
