// Generated by view binder compiler. Do not edit!
package com.example.celestialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.celestialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ManagerKeywordItemBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView nameTextView;

  private ManagerKeywordItemBinding(@NonNull TextView rootView, @NonNull TextView nameTextView) {
    this.rootView = rootView;
    this.nameTextView = nameTextView;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ManagerKeywordItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ManagerKeywordItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.manager_keyword_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ManagerKeywordItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView nameTextView = (TextView) rootView;

    return new ManagerKeywordItemBinding((TextView) rootView, nameTextView);
  }
}
