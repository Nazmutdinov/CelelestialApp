package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SearchFragmentArgs(
  public val keywords: Array<String>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("keywords", this.keywords)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("keywords", this.keywords)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchFragmentArgs {
      bundle.setClassLoader(SearchFragmentArgs::class.java.classLoader)
      val __keywords : Array<String>?
      if (bundle.containsKey("keywords")) {
        __keywords = bundle.getStringArray("keywords")
        if (__keywords == null) {
          throw IllegalArgumentException("Argument \"keywords\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"keywords\" is missing and does not have an android:defaultValue")
      }
      return SearchFragmentArgs(__keywords)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SearchFragmentArgs {
      val __keywords : Array<String>?
      if (savedStateHandle.contains("keywords")) {
        __keywords = savedStateHandle["keywords"]
        if (__keywords == null) {
          throw IllegalArgumentException("Argument \"keywords\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"keywords\" is missing and does not have an android:defaultValue")
      }
      return SearchFragmentArgs(__keywords)
    }
  }
}
