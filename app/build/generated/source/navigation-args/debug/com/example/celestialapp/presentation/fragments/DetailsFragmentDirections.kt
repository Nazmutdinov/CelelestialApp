package com.example.celestialapp.presentation.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.celestialapp.R
import kotlin.Array
import kotlin.Int
import kotlin.String

public class DetailsFragmentDirections private constructor() {
  private data class ActionDetailsFragmentToSearchFragment(
    public val keywords: Array<String>
  ) : NavDirections {
    public override val actionId: Int = R.id.action_detailsFragment_to_searchFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putStringArray("keywords", this.keywords)
        return result
      }
  }

  private data class ActionDetailsFragmentToZoomFragment(
    public val nasaId: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_detailsFragment_to_zoomFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nasaId", this.nasaId)
        return result
      }
  }

  public companion object {
    public fun actionDetailsFragmentToSearchFragment(keywords: Array<String>): NavDirections =
        ActionDetailsFragmentToSearchFragment(keywords)

    public fun actionDetailsFragmentToZoomFragment(nasaId: String?): NavDirections =
        ActionDetailsFragmentToZoomFragment(nasaId)
  }
}
