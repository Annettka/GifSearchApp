package by.it.academy.gifsearchapp.app.ui.fragmets.gifgalleryfragment

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import by.it.academy.gifsearchapp.R
import by.it.academy.gifsearchapp.databinding.FragmentGifGalleryBinding
import by.it.academy.gifsearchapp.app.domain.models.Gif
import by.it.academy.gifsearchapp.app.ui.GifClickListener
import by.it.academy.gifsearchapp.app.ui.viewmodels.GifViewModel
import by.it.academy.gifsearchapp.app.ui.fragmets.gifdialogfragment.GifItemDialogFragment

class GifGalleryFragment : Fragment(), GifClickListener {

    private val viewModel: GifViewModel by viewModel<GifViewModel>()

    private lateinit var binding: FragmentGifGalleryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGifGalleryBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gifAdapter = GifAdapter(this)

        binding.recyclerViewGif.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = gifAdapter
        }

        viewModel.gifList.observe(viewLifecycleOwner, Observer {
            gifAdapter.apply {
                submitList(it)
                notifyDataSetChanged()
            }
        })
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.search_menu, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView = searchItem.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    binding.recyclerViewGif.scrollToPosition(0)
                    viewModel.searchGifs(query)
                    searchView.clearFocus()
                }
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }

    override fun onGifClick(gif: Gif) {
        viewModel.setSelectedGif(gif)
        GifItemDialogFragment(viewModel).show(childFragmentManager, "gif_details")
    }
}