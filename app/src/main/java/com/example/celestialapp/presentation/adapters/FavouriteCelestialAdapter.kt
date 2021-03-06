package com.example.celestialapp.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.celestialapp.databinding.CelestialItemBinding
import com.example.celestialapp.domain.models.FavouriteCelestialDataItem

// адаптер для избранных небесных тел
class FavouriteCelestialAdapter(
    private val callbackItemClick: (FavouriteCelestialDataItem) -> Unit
) : ListAdapter<FavouriteCelestialDataItem, FavouriteCelestialAdapter.Holder>(DiffCallback) {
    class Holder(val binding: CelestialItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =
            CelestialItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = getItem(position) ?: return

        with(holder.binding) {
            imageView.load(item.image)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP

            // слушаем тап по картинке небесного тела
            imageView.setOnClickListener {
                callbackItemClick(item)
            }
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<FavouriteCelestialDataItem>() {
        override fun areContentsTheSame(
            oldItem: FavouriteCelestialDataItem,
            newItem: FavouriteCelestialDataItem
        ) = oldItem.celestialId == newItem.celestialId


        override fun areItemsTheSame(
            oldItem: FavouriteCelestialDataItem,
            newItem: FavouriteCelestialDataItem
        ) = oldItem.celestialId == newItem.celestialId

    }

}