package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.celestialapp.R
import kotlin.Int
import kotlin.String

public class FavouriteDetailsFragmentDirections private constructor() {
  private data class ActionFavouriteDetailsFragmentToZoomFragment(
    public val nasaId: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favouriteDetailsFragment_to_zoomFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nasaId", this.nasaId)
        return result
      }
  }

  public companion object {
    public fun actionFavouriteDetailsFragmentToZoomFragment(nasaId: String?): NavDirections =
        ActionFavouriteDetailsFragmentToZoomFragment(nasaId)
  }
}
