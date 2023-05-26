package com.example.a7month_project.presentation.ui.fragments.listofnote

import com.example.a7month_project.domain.model.Note
import com.example.a7month_project.domain.usecase.CreateNoteUseCase
import com.example.a7month_project.domain.usecase.EditNoteUseCase
import com.example.a7month_project.domain.usecase.GetAllNotesUseCase
import com.example.a7month_project.domain.usecase.RemoveNoteUseCase
import com.example.a7month_project.presentation.base.BaseViewModel
import com.example.a7month_project.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ListOfNoteViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase,
    private val removeNoteUseCase: RemoveNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val createNoteUseCase: CreateNoteUseCase
): BaseViewModel() {
    private val _getAllNotesState = MutableStateFlow<UIState<List<Note>>>(UIState.Empty())
    val getAllNotesState = _getAllNotesState.asStateFlow()

    private val _removeNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val removeNoteState = _removeNoteState.asStateFlow()

    private val _editNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val editNoteState = _editNoteState.asStateFlow()

    private val _createNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    fun getAllNotes(){
        getAllNotesUseCase.getAllNotes().collectData(_getAllNotesState)
    }

    fun removeNote(note: Note){
        removeNoteUseCase.removeNote(note).collectData(_removeNoteState)
    }

    fun editNote(note: Note){
        removeNoteUseCase.removeNote(note).collectData(_editNoteState)
    }

    fun createNote(note: Note){
        removeNoteUseCase.removeNote(note).collectData(_createNoteState)
    }

}