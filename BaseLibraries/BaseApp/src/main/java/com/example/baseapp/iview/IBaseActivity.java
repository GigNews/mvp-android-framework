package com.example.baseapp.iview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baseapp.iview.IActivity;

/**
 * @ClassName: IBaseActivity
 * @author create by Tang
 * @date date 16/10/26 下午1:47
 * @Description: BaseActivity对应接口
 */

public interface IBaseActivity extends IActivity {

    View setContentView(LayoutInflater inflater, ViewGroup container);
    
}
