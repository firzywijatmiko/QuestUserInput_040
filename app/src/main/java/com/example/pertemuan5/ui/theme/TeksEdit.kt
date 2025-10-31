package com.example.pertemuan5.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ParentDataModifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableLongStateOf(value = "")}
    var textAlamat by remember {mutableLongStateOf(value = "")}
    var textJK by remember {mutableLongStateOf(value = "")}

    var nama by remember {mutableLongStateOf(value = "")}
    var alamat by remember {mutableLongStateOf(value = "")}
    var jenis by remember {mutableLongStateOf(value = "")}

    val gender:List<String> = listOf("laki-laki" , "Perempuan")


}