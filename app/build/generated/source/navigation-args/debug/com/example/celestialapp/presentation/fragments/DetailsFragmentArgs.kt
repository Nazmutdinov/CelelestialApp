package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val nasaId: String,
  public val imagePath: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("nasaId", this.nasaId)
    result.putString("imagePath", this.imagePath)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("nasaId", this.nasaId)
    result.set("imagePath", this.imagePath)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __nasaId : String?
      if (bundle.containsKey("nasaId")) {
        __nasaId = bundle.getString("nasaId")
        if (__nasaId == null) {
          throw IllegalArgumentException("Argument \"nasaId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"nasaId\" is missing and does not have an android:defaultValue")
      }
      val __imagePath : String?
      if (bundle.containsKey("imagePath")) {
        __imagePath = bundle.getString("imagePath")
      } else {
        throw IllegalArgumentException("Required argument \"imagePath\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__nasaId, __imagePath)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __nasaId : String?
      if (savedStateHandle.contains("nasaId")) {
        __nasaId = savedStateHandle["nasaId"]
        if (__nasaId == null) {
          throw IllegalArgumentException("Argument \"nasaId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"nasaId\" is missing and does not have an android:defaultValue")
      }
      val __imagePath : String?
      if (savedStateHandle.contains("imagePath")) {
        __imagePath = savedStateHandle["imagePath"]
      } else {
        throw IllegalArgumentException("Required argument \"imagePath\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__nasaId, __imagePath)
    }
  }
}
