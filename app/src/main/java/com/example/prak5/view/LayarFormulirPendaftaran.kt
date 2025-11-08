package com.example.prak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak5.R

@OptIn (ExperimentalMaterial3Api::class)
@Composable

fun FormInput(
    OnBackClick: () -> Unit,
    OnSubmitClick: () -> Unit
) {
    var textNama by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

    val genderList = listOf("Laki-laki","Perempuan")
    val statusList = listOf("Janda","Lajang","Duda")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF949494))
            .padding(20.dp),
    ) {
        Text(
            text = stringResource(id = R.string.judul_form),
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(top = 30.dp, bottom = 30.dp),
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Text(text = stringResource(id = R.string.nama_lengkap))
                OutlinedTextField(
                    value = textNama,
                    onValueChange = { textNama = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Masukkan nama lengkap") }
                )

                Text(text = stringResource(id = R.string.alamat))
                OutlinedTextField(
                    value = textAlamat,
                    onValueChange = { textAlamat = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Masukkan alamat lengkap") }
                )
            }
        }
    }
}