package by.it.academy.gifsearchapp.app.ui.fragmets.gifgalleryfragment


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import by.it.academy.gifsearchapp.R
import by.it.academy.gifsearchapp.databinding.ItemGifBinding
import by.it.academy.gifsearchapp.app.domain.models.Gif
import by.it.academy.gifsearchapp.app.ui.GifClickListener
import com.bumptech.glide.Glide


class GifAdapter(val clickListener: GifClickListener) :
    ListAdapter<Gif, GifAdapter.GifViewHolder>(GifDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemGifBinding =
            DataBindingUtil.inflate(inflater, R.layout.item_gif, parent, false)
        return GifViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        val gif = getItem(position)
        holder.bind(gif)
    }

    override fun getItemCount(): Int = currentList.size

    inner class GifViewHolder(private val binding: ItemGifBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(gif: Gif) {
            binding.apply {
                Glide.with(itemView)
                    .load(gif.url)
                    .centerCrop()
                    .error(R.drawable.ic_refresh)
                    .into(gifImageView)
            }
            binding.gifImageView.setOnClickListener {
                clickListener.onGifClick(gif)
            }
        }
    }
}

private class GifDiffCallback : DiffUtil.ItemCallback<Gif>() {

    override fun areItemsTheSame(
        oldItem: Gif,
        newItem: Gif
    ): Boolean {
        return oldItem.url == newItem.url
    }

    override fun areContentsTheSame(
        oldItem: Gif,
        newItem: Gif
    ): Boolean {
        return oldItem == newItem
    }
}