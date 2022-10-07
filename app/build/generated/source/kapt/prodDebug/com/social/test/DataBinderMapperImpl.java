package com.social.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.social.test.databinding.ActivityMainBindingImpl;
import com.social.test.databinding.FragmentPostBindingImpl;
import com.social.test.databinding.FragmentPostDetailBindingImpl;
import com.social.test.databinding.FragmentSplashBindingImpl;
import com.social.test.databinding.ItemCommentBindingImpl;
import com.social.test.databinding.ItemPostBindingImpl;
import com.social.test.databinding.LoadStateViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTPOST = 2;

  private static final int LAYOUT_FRAGMENTPOSTDETAIL = 3;

  private static final int LAYOUT_FRAGMENTSPLASH = 4;

  private static final int LAYOUT_ITEMCOMMENT = 5;

  private static final int LAYOUT_ITEMPOST = 6;

  private static final int LAYOUT_LOADSTATEVIEW = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.fragment_post, LAYOUT_FRAGMENTPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.fragment_post_detail, LAYOUT_FRAGMENTPOSTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.item_comment, LAYOUT_ITEMCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.item_post, LAYOUT_ITEMPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.social.test.R.layout.load_state_view, LAYOUT_LOADSTATEVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOST: {
          if ("layout/fragment_post_0".equals(tag)) {
            return new FragmentPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_post is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOSTDETAIL: {
          if ("layout/fragment_post_detail_0".equals(tag)) {
            return new FragmentPostDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_post_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOMMENT: {
          if ("layout/item_comment_0".equals(tag)) {
            return new ItemCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOST: {
          if ("layout/item_post_0".equals(tag)) {
            return new ItemPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_post is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADSTATEVIEW: {
          if ("layout/load_state_view_0".equals(tag)) {
            return new LoadStateViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for load_state_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.social.test.R.layout.activity_main);
      sKeys.put("layout/fragment_post_0", com.social.test.R.layout.fragment_post);
      sKeys.put("layout/fragment_post_detail_0", com.social.test.R.layout.fragment_post_detail);
      sKeys.put("layout/fragment_splash_0", com.social.test.R.layout.fragment_splash);
      sKeys.put("layout/item_comment_0", com.social.test.R.layout.item_comment);
      sKeys.put("layout/item_post_0", com.social.test.R.layout.item_post);
      sKeys.put("layout/load_state_view_0", com.social.test.R.layout.load_state_view);
    }
  }
}
