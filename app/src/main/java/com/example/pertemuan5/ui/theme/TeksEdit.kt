package com.example.pertemuan5.ui.theme

import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ParentDataModifier
import androidx.compose.ui.layout.VerticalAlignmentLine

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

    Column {modifier = modifier.padding(top = 50dp),
        VerticalAlignment = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = textNama,
                singleline = true,
                shape = MaterialTheme.shapes.large,
                modifier = modifier.width(width = 250.dp),
                label =  {Text(text = "nama lengkap")},
                onValueChange = {
                    textNama = it
                }
            )

        }
    }


}