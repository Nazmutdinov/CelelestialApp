package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.celestialapp.R
import kotlin.Int
import kotlin.String

public class FavouriteFragmentDirections private constructor() {
  private data class ActionFavouriteFragmentToFavouriteDetailsFragment(
    public val nasaId: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favouriteFragment_to_favouriteDetailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nasaId", this.nasaId)
        return result
      }
  }

  public companion object {
    public fun actionFavouriteFragmentToKeywordsManagerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favouriteFragment_to_keywordsManagerFragment)

    public fun actionFavouriteFragmentToFavouriteDetailsFragment(nasaId: String?): NavDirections =
        ActionFavouriteFragmentToFavouriteDetailsFragment(nasaId)
  }
}
