package com.bwie.fanliang.zhoukao3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanliang on 2017/5/21.
 */

public class Fragment02 extends Fragment{

    private ExpandableListView listView;
    private List<String> gList;
    private List<String> cList;
    private List<List<String>> cLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment02, container, false);

        listView = (ExpandableListView) view.findViewById(R.id.e_list);
        //设置不使用默认的指示图标---对应着xml属性
        listView.setGroupIndicator(null);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //组的数据
        gList = new ArrayList<String>();
        gList.add("我的好友");
        gList.add("我的家人");
        gList.add("同事");
        gList.add("同学");

        //一个组中的数据
        cList = new ArrayList<String>();
        cList.add("范冰冰");
        cList.add("高圆圆");
        cList.add("柳岩");
        cList.add("龙泽");
        //每个组的数据放在一个集合中,,,方便起见,数据使用一样的
        cLists = new ArrayList<List<String>>();
        cLists.add(cList);
        cLists.add(cList);
        cLists.add(cList);
        cLists.add(cList);

        //各个组里面的头像数据
        List<Integer> cImgList = new ArrayList<Integer>();
        cImgList.add(R.mipmap.ic_launcher);
        cImgList.add(R.mipmap.ic_launcher);
        cImgList.add(R.mipmap.ic_launcher);
        cImgList.add(R.mipmap.ic_launcher);
        //所有头像数据加到一个集合中
        List<List<Integer>> cImgLists = new ArrayList<List<Integer>>();
        cImgLists.add(cImgList);
        cImgLists.add(cImgList);
        cImgLists.add(cImgList);
        cImgLists.add(cImgList);

        Eadapter adapter = new Eadapter(getActivity(),gList,cLists,cImgLists);
        listView.setAdapter(adapter);
    }
}
