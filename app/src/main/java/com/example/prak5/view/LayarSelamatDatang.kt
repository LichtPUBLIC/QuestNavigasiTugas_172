package com.example.prak5.view

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.prak5.R

@OptIn (ExperimentalMaterial3Api::class)
@Composable
fun Home (
    OnMasukBtnClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF949494))
            .padding (horizontal = 24.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
        )

        Image(
            painter = painterResource(id = R.drawable.wibusad),
            contentDescription = "Logo Aplikasi",
            modifier = Modifier
                .size(300.dp)
                .padding(vertical = 16.dp)
        )
    }
}