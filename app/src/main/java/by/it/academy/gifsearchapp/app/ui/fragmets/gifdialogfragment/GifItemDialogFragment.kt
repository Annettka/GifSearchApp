package by.it.academy.gifsearchapp.app.ui.fragmets.gifdialogfragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import by.it.academy.gifsearchapp.R
import by.it.academy.gifsearchapp.databinding.FragmentDialogItemGifBinding
import by.it.academy.gifsearchapp.app.ui.viewmodels.GifViewModel
import com.bumptech.glide.Glide

class GifItemDialogFragment(private val viewModel: GifViewModel) : DialogFragment() {

    private lateinit var binding: FragmentDialogItemGifBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        binding = FragmentDialogItemGifBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectedGif.observe(viewLifecycleOwner, Observer {selectedGif ->
            binding.ivSelectedGif.apply {
                Glide.with(view)
                    .load(selectedGif.url)
                    .centerCrop()
                    .error(R.drawable.ic_refresh)
                    .into(this)
            }

            binding.ivShareGif.setOnClickListener {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, selectedGif.url)
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
        })

        binding.ivCloseDialog.setOnClickListener {
            onDestroyView()
        }
    }
}