package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.celestialapp.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailsFragment(
    public val nasaId: String,
    public val imagePath: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_detailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nasaId", this.nasaId)
        result.putString("imagePath", this.imagePath)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToDetailsFragment(nasaId: String, imagePath: String?):
        NavDirections = ActionHomeFragmentToDetailsFragment(nasaId, imagePath)
  }
}
