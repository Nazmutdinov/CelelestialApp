package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ZoomFragmentArgs(
  public val nasaId: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("nasaId", this.nasaId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("nasaId", this.nasaId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ZoomFragmentArgs {
      bundle.setClassLoader(ZoomFragmentArgs::class.java.classLoader)
      val __nasaId : String?
      if (bundle.containsKey("nasaId")) {
        __nasaId = bundle.getString("nasaId")
      } else {
        throw IllegalArgumentException("Required argument \"nasaId\" is missing and does not have an android:defaultValue")
      }
      return ZoomFragmentArgs(__nasaId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ZoomFragmentArgs {
      val __nasaId : String?
      if (savedStateHandle.contains("nasaId")) {
        __nasaId = savedStateHandle["nasaId"]
      } else {
        throw IllegalArgumentException("Required argument \"nasaId\" is missing and does not have an android:defaultValue")
      }
      return ZoomFragmentArgs(__nasaId)
    }
  }
}
