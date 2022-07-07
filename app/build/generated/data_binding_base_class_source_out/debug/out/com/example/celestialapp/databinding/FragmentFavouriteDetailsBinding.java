// Generated by view binder compiler. Do not edit!
package com.example.celestialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.celestialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFavouriteDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addKeywordButton;

  @NonNull
  public final ImageView celestialImageView;

  @NonNull
  public final TextView descriptionTextView;

  @NonNull
  public final RecyclerView recycleView;

  @NonNull
  public final TextView timeAgoTextView;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final Toolbar toolbar;

  private FragmentFavouriteDetailsBinding(@NonNull LinearLayout rootView,
      @NonNull Button addKeywordButton, @NonNull ImageView celestialImageView,
      @NonNull TextView descriptionTextView, @NonNull RecyclerView recycleView,
      @NonNull TextView timeAgoTextView, @NonNull TextView titleTextView,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.addKeywordButton = addKeywordButton;
    this.celestialImageView = celestialImageView;
    this.descriptionTextView = descriptionTextView;
    this.recycleView = recycleView;
    this.timeAgoTextView = timeAgoTextView;
    this.titleTextView = titleTextView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFavouriteDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFavouriteDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_favourite_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFavouriteDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_keyword_button;
      Button addKeywordButton = ViewBindings.findChildViewById(rootView, id);
      if (addKeywordButton == null) {
        break missingId;
      }

      id = R.id.celestial_image_view;
      ImageView celestialImageView = ViewBindings.findChildViewById(rootView, id);
      if (celestialImageView == null) {
        break missingId;
      }

      id = R.id.description_text_view;
      TextView descriptionTextView = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextView == null) {
        break missingId;
      }

      id = R.id.recycle_view;
      RecyclerView recycleView = ViewBindings.findChildViewById(rootView, id);
      if (recycleView == null) {
        break missingId;
      }

      id = R.id.time_ago_text_view;
      TextView timeAgoTextView = ViewBindings.findChildViewById(rootView, id);
      if (timeAgoTextView == null) {
        break missingId;
      }

      id = R.id.title_text_view;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentFavouriteDetailsBinding((LinearLayout) rootView, addKeywordButton,
          celestialImageView, descriptionTextView, recycleView, timeAgoTextView, titleTextView,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
