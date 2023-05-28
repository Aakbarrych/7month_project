package com.example.a7month_project.presentation.ui.fragments.listofnote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.a7month_project.R
import com.example.a7month_project.databinding.FragmentListOfNoteBinding
import com.example.a7month_project.presentation.base.BaseFragment
import com.example.a7month_project.presentation.utils.UIState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListOfNoteFragment : BaseFragment() {
    private lateinit var binding: FragmentListOfNoteBinding
    private val viewModel by viewModels<ListOfNoteViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListOfNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getAllNotes()
        initListener()
    }

    private fun initListener(){
        findNavController().navigate(R.id.action_listOfNoteFragment_to_editListFragment)
    }

    private fun getAllNotes(){
        viewModel.getAllNotes()
        viewModel.getAllNotesState.collectState(state =
        { state ->
            binding.progressBar.isVisible = state is UIState.Loading
        }, onSuccess = {data ->
            // noteAdapter.addList(data)
        })
    }
}