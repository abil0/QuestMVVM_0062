package com.example.pertemuan8.ViewModel

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()


    }
}